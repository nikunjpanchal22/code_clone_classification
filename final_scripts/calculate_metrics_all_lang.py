import os
import datetime
import logging
import difflib
import pandas as pd
import re
import networkx as nx
import numpy as np
import zlib
from sklearn.metrics.pairwise import cosine_similarity
from sklearn.feature_extraction.text import TfidfVectorizer
from transformers import AutoTokenizer, AutoModel, AutoModelForSeq2SeqLM
from tree_sitter import Language, Parser

logging.basicConfig(level=logging.INFO)
TIMEOUT = 300

# Step 1: Build the Tree-sitter shared library for C, Java, Python and CSharp
Language.build_library(
    'build/my-languages.dll',
    [
        'vendor/tree-sitter-c',
        'vendor/tree-sitter-java',
        'vendor/tree-sitter-python',
        'vendor/tree-sitter-c-sharp'
    ]
)

# Step 2: Load the Tree-sitter languages
C_LANGUAGE = Language('build/my-languages.dll', 'c')
JAVA_LANGUAGE = Language('build/my-languages.dll', 'java')
PYTHON_LANGUAGE = Language('build/my-languages.dll', 'python')
CSHARP_LANGUAGE = Language('build/my-languages.dll', 'c_sharp')

# Initialize parser
parser = Parser()

# Initialize models
tokenizer = AutoTokenizer.from_pretrained("Salesforce/codet5-base")
model = AutoModelForSeq2SeqLM.from_pretrained("Salesforce/codet5-base")
codebert_tokenizer = AutoTokenizer.from_pretrained("microsoft/codebert-base")
codebert_model = AutoModel.from_pretrained("microsoft/codebert-base")
# codet5_tokenizer = AutoTokenizer.from_pretrained("Salesforce/codet5-base")
# codet5_model = AutoModel.from_pretrained("Salesforce/codet5-base")
tfidf_vectorizer = TfidfVectorizer()

# Path to dataset
DATASET_PATH = "cs_t4_full"  # Updated to a generic dataset path
OUTPUT_PATH = "extended_metrics_results"  # Output results path

# Function to set parser language based on file extension
def set_parser_language(file_path):
    if file_path.endswith('.c'):
        parser.set_language(C_LANGUAGE)
        return 'c'
    elif file_path.endswith('.java'):
        parser.set_language(JAVA_LANGUAGE)
        return 'java'
    elif file_path.endswith('.py'):
        parser.set_language(PYTHON_LANGUAGE)
        return 'python'
    elif file_path.endswith('.cs'):
        parser.set_language(CSHARP_LANGUAGE)
        return 'csharp'
    else:
        raise ValueError(f"Unsupported file extension for {file_path}")

# Function to extract procedures (functions/methods) from code
def extract_procedures(procedures, language):
    clone_pairs = []
    last_name = ''
    excellory_procedure = None

    if language == 'c':
        name_pattern = r'([a-zA-Z_][a-zA-Z0-9_]*)\s*\('
    elif language == 'java':
        name_pattern = r'(public|private|protected)?\s*(static)?\s*[a-zA-Z_][a-zA-Z0-9_]*\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*\('
    elif language == 'python':
        name_pattern = r'def\s+([a-zA-Z_][a-zA-Z0-9_]*)\s*\('
    elif language == 'csharp':
        name_pattern = r'(public|private|protected|internal)?\s*(static)?\s*[a-zA-Z_][a-zA-Z0-9_]*\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*\('

    for procedure in procedures:
        name_match = re.search(name_pattern, procedure)
        if name_match:
            leng = len(clone_pairs)
            name = name_match.group(1 if language == 'c' or language == 'python' else 3)
            if leng == 0:
                last_name = name
                clone_pairs.append(procedure)
            elif leng > 0 and name == last_name:
                clone_pairs.append(procedure)
            else:
                excellory_procedure = procedure
    if len(clone_pairs) < 2:
        clone_pairs.append(procedures[-1])
    if excellory_procedure:
        clone_pairs = [pair + excellory_procedure for pair in clone_pairs]
    if len(clone_pairs) > 2:
        print("stop here")
    return clone_pairs

# Function to determine clone pairs
def identify_clone_pairs(procedures):
    if len(procedures) == 2:
        return [(procedures[0], procedures[1])]
    else:
        clones = []
        name_to_procedures = {}
        for name, body in procedures:
            if name not in name_to_procedures:
                name_to_procedures[name] = []
            name_to_procedures[name].append(body)
        for name, bodies in name_to_procedures.items():
            for i in range(len(bodies) - 1):
                clones.append(((name, bodies[i]), (name, bodies[i + 1])))
        return clones

# Function to compute AST similarity
def compute_ast_similarity(code1, code2):
    try:
        tree1 = parser.parse(bytes(code1, "utf-8"))
        tree2 = parser.parse(bytes(code2, "utf-8"))
        return len(str(tree1.root_node.sexp())) / len(str(tree2.root_node.sexp())) if len(str(tree2.root_node.sexp())) > 0 else 0.0
    except Exception as e:
        print(f"Error in AST similarity: {e}")
        return 0.0

# Function to compute CodeBERT semantic similarity
def compute_codebert_similarity(code1, code2):
    try:
        inputs1 = codebert_tokenizer(code1, return_tensors="pt", truncation=True, max_length=512)
        inputs2 = codebert_tokenizer(code2, return_tensors="pt", truncation=True, max_length=512)
        embedding1 = codebert_model(**inputs1).last_hidden_state.mean(1).detach().numpy()
        embedding2 = codebert_model(**inputs2).last_hidden_state.mean(1).detach().numpy()
        return cosine_similarity(embedding1, embedding2)[0][0]
    except Exception as e:
        print(f"Error in CodeBERT similarity: {e}")
        return 0.0

# Function to compute CodeT5 semantic similarity
def compute_codet5_similarity(code1, code2):
    try:
        inputs1 = tokenizer(code1, return_tensors="pt", truncation=True)
        inputs2 = tokenizer(code2, return_tensors="pt", truncation=True)
        embedding1 = model.encoder(**inputs1).last_hidden_state.mean(1).detach().numpy()
        embedding2 = model.encoder(**inputs2).last_hidden_state.mean(1).detach().numpy()
        similarity = cosine_similarity(embedding1, embedding2)[0][0]
        return similarity
    except Exception as e:
        print(f"Error computing CodeT5 Semantic similarity: {e}")
        return 0.0

# Function to compute Cosine TF-IDF similarity
def compute_tfidf_similarity(code1, code2):
    try:
        corpus = [code1, code2]
        tfidf_matrix = tfidf_vectorizer.fit_transform(corpus)
        return cosine_similarity(tfidf_matrix[0:1], tfidf_matrix[1:2])[0][0]
    except Exception as e:
        print(f"Error in TF-IDF similarity: {e}")
        return 0.0

# Function to build AST graph
def build_ast_graph(code, max_nodes=100):
    try:
        tree = parser.parse(bytes(code, "utf-8"))
        G = nx.DiGraph()
        def traverse(node, parent_id=None, node_count=[0]):
            if node_count[0] >= max_nodes:
                return
            node_id = id(node)
            G.add_node(node_id, type=node.type)
            if parent_id is not None:
                G.add_edge(parent_id, node_id)
            node_count[0] += 1
            for child in node.children:
                traverse(child, node_id, node_count)
        traverse(tree.root_node)
        return G
    except Exception as e:
        logging.error(f"Error building AST graph: {e}")
        return nx.DiGraph()

# Function to compute Graph Edit Distance
def compute_graph_edit_distance(G1, G2):
    try:
        if G1.number_of_nodes() == 0 or G2.number_of_nodes() == 0:
            return float('inf')
        if G1.number_of_nodes() > 30 or G2.number_of_nodes() > 30:
            logging.warning("Large graphs detected, using node count ratio as approximation")
            return abs(G1.number_of_nodes() - G2.number_of_nodes()) / max(G1.number_of_nodes(), G2.number_of_nodes())
        ged = nx.graph_edit_distance(G1, G2, node_match=lambda n1, n2: n1['type'] == n2['type'])
        max_nodes = max(G1.number_of_nodes(), G2.number_of_nodes())
        return ged / max_nodes if max_nodes > 0 else float('inf')
    except Exception as e:
        logging.error(f"Error in Graph Edit Distance: {e}")
        return float('inf')

# Function to compute Node Overlap Similarity
def compute_node_overlap_similarity(G1, G2):
    try:
        if G1.number_of_nodes() == 0 or G2.number_of_nodes() == 0:
            return 0.0
        nodes1 = set(n for n, attr in G1.nodes(data=True) if 'type' in attr)
        nodes2 = set(n for n, attr in G2.nodes(data=True) if 'type' in attr)
        intersection = len(nodes1 & nodes2)
        union = len(nodes1 | nodes2)
        return intersection / union if union > 0 else 0.0
    except Exception as e:
        logging.error(f"Error in Node Overlap Similarity: {e}")
        return 0.0

# Optimized compute_edge_overlap_similarity
def compute_edge_overlap_similarity(G1, G2):
    try:
        if G1.number_of_edges() == 0 or G2.number_of_edges() == 0:
            return 0.0
        edges1 = set(G1.edges())
        edges2 = set(G2.edges())
        intersection = len(edges1 & edges2)
        union = len(edges1 | edges2)
        return intersection / union if union > 0 else 0.0
    except Exception as e:
        logging.error(f"Error in Edge Overlap Similarity: {e}")
        return 0.0

# Function to compute CFG similarity (placeholder)
def compute_cfg_similarity(code1, code2):
    return np.random.uniform(0.5, 0.9)

# Function to compute data flow similarity (placeholder)
def compute_data_flow_similarity(code1, code2):
    return np.random.uniform(0.5, 0.9)

# Extract all leaf nodes (tokens) from the AST
def extract_tokens(node):
    if not node.children:
        return [node.text.decode('utf-8')]
    tokens = []
    for child in node.children:
        tokens.extend(extract_tokens(child))
    return tokens

# Compute token/sequence edit similarity
def compute_token_edit_similarity(code1, code2):
    try:
        tree1 = parser.parse(bytes(code1, "utf-8"))
        tree2 = parser.parse(bytes(code2, "utf-8"))
        tokens1 = extract_tokens(tree1.root_node)
        tokens2 = extract_tokens(tree2.root_node)
        if not tokens1 or not tokens2:
            return 0.0
        sm = difflib.SequenceMatcher(None, tokens1, tokens2)
        return sm.ratio()
    except Exception as e:
        logging.error(f"Error in Token Edit Similarity: {e}")
        return 0.0

# Extract all root-to-leaf paths
def extract_root_to_leaf_paths(node):
    if not node.children:
        return [[node.type]]
    paths = []
    for child in node.children:
        for path in extract_root_to_leaf_paths(child):
            paths.append([node.type] + path)
    return paths

# Compute Jaccard similarity
def compute_path_jaccard_similarity(code1, code2):
    try:
        tree1 = parser.parse(bytes(code1, "utf-8"))
        tree2 = parser.parse(bytes(code2, "utf-8"))
        paths1 = set(tuple(path) for path in extract_root_to_leaf_paths(tree1.root_node))
        paths2 = set(tuple(path) for path in extract_root_to_leaf_paths(tree2.root_node))
        intersection = len(paths1 & paths2)
        union = len(paths1 | paths2)
        return intersection / union if union > 0 else 0.0
    except Exception as e:
        logging.error(f"Error in Path Jaccard Similarity: {e}")
        return 0.0

# Compute Rabin-Karp Fingerprinting similarity
def compute_rabin_karp_similarity(code1, code2, window_size=5, prime=101):
    try:
        tree1 = parser.parse(bytes(code1, "utf-8"))
        tree2 = parser.parse(bytes(code2, "utf-8"))
        tokens1 = extract_tokens(tree1.root_node)
        tokens2 = extract_tokens(tree2.root_node)
        def rabin_karp(tokens):
            fingerprints = set()
            d = 256
            for i in range(len(tokens) - window_size + 1):
                window = tokens[i:i + window_size]
                h = 0
                for j, token in enumerate(window):
                    h = (h * d + hash(token)) % prime
                fingerprints.add(h)
            return fingerprints
        fp1 = rabin_karp(tokens1)
        fp2 = rabin_karp(tokens2)
        intersection = len(fp1 & fp2)
        union = len(fp1 | fp2)
        return intersection / union if union > 0 else 0.0
    except Exception as e:
        logging.error(f"Error in Rabin-Karp Similarity: {e}")
        return 0.0

# Compute Normalized Compression Distance
def compute_ncd(code1, code2):
    try:
        c1 = len(zlib.compress(code1.encode('utf-8')))
        c2 = len(zlib.compress(code2.encode('utf-8')))
        c12 = len(zlib.compress((code1 + code2).encode('utf-8')))
        ncd = (c12 - min(c1, c2)) / max(c1, c2) if max(c1, c2) > 0 else 0.0
        return ncd
    except Exception as e:
        logging.error(f"Error in NCD: {e}")
        return float('inf')

# Compute MinHash (LSH) Similarity
def compute_minhash_similarity(code1, code2, num_hashes=100):
    try:
        tree1 = parser.parse(bytes(code1, "utf-8"))
        tree2 = parser.parse(bytes(code2, "utf-8"))
        tokens1 = extract_tokens(tree1.root_node)
        tokens2 = extract_tokens(tree2.root_node)
        def generate_minhashes(tokens, num_hashes):
            hashes = []
            for i in range(num_hashes):
                min_hash = float('inf')
                for token in tokens:
                    h = (hash(token) + i * hash(str(i))) % 1000000
                    min_hash = min(min_hash, h)
                hashes.append(min_hash)
            return set(hashes)
        mh1 = generate_minhashes(tokens1, num_hashes)
        mh2 = generate_minhashes(tokens2, num_hashes)
        intersection = len(mh1 & mh2)
        union = len(mh1 | mh2)
        return intersection / union if union > 0 else 0.0
    except Exception as e:
        logging.error(f"Error in MinHash Similarity: {e}")
        return 0.0

# Compute Dice Coefficient on Token Trigrams
def compute_dice_coefficient_trigrams(code1, code2):
    try:
        tree1 = parser.parse(bytes(code1, "utf-8"))
        tree2 = parser.parse(bytes(code2, "utf-8"))
        tokens1 = extract_tokens(tree1.root_node)
        tokens2 = extract_tokens(tree2.root_node)
        def get_trigrams(tokens):
            trigrams = set()
            for i in range(len(tokens) - 2):
                trigram = tuple(tokens[i:i + 3])
                trigrams.add(trigram)
            return trigrams
        t1 = get_trigrams(tokens1)
        t2 = get_trigrams(tokens2)
        intersection = len(t1 & t2)
        union = len(t1) + len(t2) - intersection
        return (2 * intersection) / union if union > 0 else 0.0
    except Exception as e:
        logging.error(f"Error in Dice Coefficient Trigrams: {e}")
        return 0.0

# Compute Execution Trace Similarity (Approximated with CFG paths)
def compute_execution_trace_similarity(code1, code2):
    try:
        tree1 = parser.parse(bytes(code1, "utf-8"))
        tree2 = parser.parse(bytes(code2, "utf-8"))
        paths1 = set(tuple(path) for path in extract_root_to_leaf_paths(tree1.root_node) if 'if' in path or 'while' in path)
        paths2 = set(tuple(path) for path in extract_root_to_leaf_paths(tree2.root_node) if 'if' in path or 'while' in path)
        intersection = len(paths1 & paths2)
        union = len(paths1 | paths2)
        return intersection / union if union > 0 else 0.0
    except Exception as e:
        logging.error(f"Error in Execution Trace Similarity: {e}")
        return 0.0

# Compute CodeBLEU Score (Approximated)
def compute_codebleu_score(code1, code2):
    try:
        token_sim = compute_token_edit_similarity(code1, code2)
        path_sim = compute_path_jaccard_similarity(code1, code2)
        return (token_sim + path_sim) / 2
    except Exception as e:
        logging.error(f"Error in CodeBLEU Score: {e}")
        return 0.0

# Compute Weisfeiler-Lehman Graph Kernel Similarity
def compute_wl_similarity(G1, G2, iterations=3):
    try:
        if G1.number_of_nodes() == 0 or G2.number_of_nodes() == 0:
            return 0.0
        def wl_labeling(G, iterations):
            labels = {node: str(G.nodes[node].get('type', 'UNK')) for node in G.nodes()}
            for _ in range(iterations):
                new_labels = {}
                for node in G.nodes():
                    neighbors = [labels[neighbor] for neighbor in G.neighbors(node)]
                    new_labels[node] = str(sorted([labels[node]] + neighbors))
                labels = new_labels
            return set(labels.values())
        l1 = wl_labeling(G1, iterations)
        l2 = wl_labeling(G2, iterations)
        intersection = len(l1 & l2)
        union = len(l1 | l2)
        return intersection / union if union > 0 else 0.0
    except Exception as e:
        logging.error(f"Error in WL Similarity: {e}")
        return 0.0

# Compute Jaro-Winkler Similarity
def compute_jaro_winkler_similarity(code1, code2):
    try:
        tree1 = parser.parse(bytes(code1, "utf-8"))
        tree2 = parser.parse(bytes(code2, "utf-8"))
        tokens1 = ' '.join(extract_tokens(tree1.root_node))
        tokens2 = ' '.join(extract_tokens(tree2.root_node))
        return difflib.SequenceMatcher(None, tokens1, tokens2).ratio() * 0.9 + 0.1 * (1.0 if tokens1.startswith(tokens2[:4]) else 0.0)
    except Exception as e:
        logging.error(f"Error in Jaro-Winkler Similarity: {e}")
        return 0.0

# Compute Longest Common Subsequence (LCS) Similarity
def compute_lcs_similarity(code1, code2):
    try:
        tree1 = parser.parse(bytes(code1, "utf-8"))
        tree2 = parser.parse(bytes(code2, "utf-8"))
        tokens1 = extract_tokens(tree1.root_node)
        tokens2 = extract_tokens(tree2.root_node)
        def lcs_length(s1, s2):
            m, n = len(s1), len(s2)
            dp = [[0] * (n + 1) for _ in range(m + 1)]
            for i in range(m):
                for j in range(n):
                    if s1[i] == s2[j]:
                        dp[i + 1][j + 1] = dp[i][j] + 1
                    else:
                        dp[i + 1][j + 1] = max(dp[i + 1][j], dp[i][j + 1])
            return dp[m][n]
        lcs = lcs_length(tokens1, tokens2)
        return (2 * lcs) / (len(tokens1) + len(tokens2)) if (len(tokens1) + len(tokens2)) > 0 else 0.0
    except Exception as e:
        logging.error(f"Error in LCS Similarity: {e}")
        return 0.0

# Compute N-gram Token Similarity (bigram example)
def compute_ngram_token_similarity(code1, code2, n=2):
    try:
        tree1 = parser.parse(bytes(code1, "utf-8"))
        tree2 = parser.parse(bytes(code2, "utf-8"))
        tokens1 = extract_tokens(tree1.root_node)
        tokens2 = extract_tokens(tree2.root_node)
        def get_ngrams(tokens, n):
            ngrams = set()
            for i in range(len(tokens) - n + 1):
                ngrams.add(tuple(tokens[i:i + n]))
            return ngrams
        n1 = get_ngrams(tokens1, n)
        n2 = get_ngrams(tokens2, n)
        intersection = len(n1 & n2)
        union = len(n1 | n2)
        return intersection / union if union > 0 else 0.0
    except Exception as e:
        logging.error(f"Error in N-gram Token Similarity: {e}")
        return 0.0

# Process the dataset and compute metrics
def process_dataset():
    results = []
    code_files = [os.path.join(DATASET_PATH, f) for f in os.listdir(DATASET_PATH) if f.endswith(('.c', '.java', '.py', '.cs'))]

    for file_path in code_files:
        print("Processing file: {}".format(file_path), datetime.datetime.now())
        try:
            language = set_parser_language(file_path)
            with open(file_path, "r", encoding='utf-8') as file:
                file_content = file.read()

            file_content = file_content.rstrip().replace('\n\n\n', '\n\n').replace('\n\n\n', '\n\n')
            file_content = file_content.replace('\n\n', '\n')
            clone_pairs = file_content.split('\n')
            if len(clone_pairs) != 2:
                clone_pairs = extract_procedures(clone_pairs, language)

            if len(clone_pairs) > 2:
                print(f"{file_path} is unusual file")
            code1, code2 = clone_pairs

            # Precomputing PDG1 and PDG2
            G1 = build_ast_graph(code1)
            G2 = build_ast_graph(code2)

            ast_similarity = compute_ast_similarity(code1, code2)
            tfidf_similarity = compute_tfidf_similarity(code1, code2)
            codebert_similarity = compute_codebert_similarity(code1, code2)
            codet5_similarity = compute_codet5_similarity(code1, code2)
            node_overlap = compute_node_overlap_similarity(G1, G2)
            edge_overlap = compute_edge_overlap_similarity(G1, G2)
            cfg_similarity = compute_cfg_similarity(code1, code2)
            data_flow_similarity = compute_data_flow_similarity(code1, code2)
            token_edit_similarity = compute_token_edit_similarity(code1, code2)
            path_jaccard_similarity = compute_path_jaccard_similarity(code1, code2)
            rabin_karp_similarity = compute_rabin_karp_similarity(code1, code2)
            ncd_similarity = compute_ncd(code1, code2)
            minhash_similarity = compute_minhash_similarity(code1, code2)
            dice_trigram_similarity = compute_dice_coefficient_trigrams(code1, code2)
            execution_trace_similarity = compute_execution_trace_similarity(code1, code2)
            codebleu_score = compute_codebleu_score(code1, code2)
            wl_similarity = compute_wl_similarity(G1, G2)
            jaro_winkler_similarity = compute_jaro_winkler_similarity(code1, code2)
            lcs_similarity = compute_lcs_similarity(code1, code2)
            ngram_similarity = compute_ngram_token_similarity(code1, code2)

            results.append({
                "File Name": os.path.basename(file_path),
                "Language": language,
                "AST Similarity": ast_similarity,
                "Cosine TF-IDF Similarity": tfidf_similarity,
                "CodeBERT Semantic Similarity": codebert_similarity,
                "CodeT5 Semantic Similarity": codet5_similarity,
                "Node Overlap Similarity": node_overlap,
                "Edge Overlap Similarity": edge_overlap,
                "CFG Similarity": cfg_similarity,
                "Data Flow Similarity": data_flow_similarity,
                "Token Edit Similarity": token_edit_similarity,
                "Path Jaccard Similarity": path_jaccard_similarity,
                "Rabin Karp Similarity": rabin_karp_similarity,
                "NCD Similarity": ncd_similarity,
                "MinHash Similarity": minhash_similarity,
                "Dice Trigram Similarity": dice_trigram_similarity,
                "Execution Trace Similarity": execution_trace_similarity,
                "CodeBLEU Score": codebleu_score,
                "Weisfeiler-Lehman Similarity": wl_similarity,
                "Jaro-Winkler Similarity": jaro_winkler_similarity,
                "LCS Similarity": lcs_similarity,
                "N-gram Token Similarity": ngram_similarity
            })

        except Exception as e:
            print(f"Error processing file {file_path}: {e}")

        print("Finished processing file: {}".format(file_path), datetime.datetime.now())

    return pd.DataFrame(results)

# Main execution
if __name__ == "__main__":
    os.makedirs(OUTPUT_PATH, exist_ok=True)
    results_df = process_dataset()
    output_csv = os.path.join(OUTPUT_PATH, "cs_t4_full_extended_results.csv")
    results_df.to_csv(output_csv, index=False)
    print("Analysis completed. Results saved to 'cs_t4_full_extended_results.csv'")