import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.feature_selection import SelectKBest, f_classif, mutual_info_classif
from sklearn.preprocessing import StandardScaler
from sklearn.ensemble import RandomForestClassifier
from sklearn.feature_selection import RFE, RFECV
import warnings
import os
import numpy as np

# Suppress warnings
warnings.filterwarnings("ignore")

# Create output directory if it doesn't exist
if not os.path.exists('selectKBest_results'):
    os.makedirs('selectKBest_results')

# Load your CSV files and add clone type labels
def load_and_analyze_clone_data():
    try:
        type12_df = pd.read_csv('extended_metrics_results/c_t1_t2_full_extended_results_0701.csv')
        type3_df = pd.read_csv('extended_metrics_results/c_t3_full_extended_results_0701.csv')
        type4_df = pd.read_csv('extended_metrics_results/c_t4_full_extended_results_0701.csv')

        # Add clone type labels
        type12_df['clone_type'] = 'type12'
        type3_df['clone_type'] = 'type3'
        type4_df['clone_type'] = 'type4'

        # Combine all dataframes
        combined_df = pd.concat([type12_df, type3_df, type4_df], ignore_index=True)

        print(f"Total samples: {len(combined_df)}")
        print(f"Clone type distribution:")
        print(combined_df['clone_type'].value_counts())

        return combined_df
    except Exception as e:
        print(f"Error loading data: {e}")
        return None

# Analyze top features using SelectKBest with specified scoring function
def analyze_features_selectkbest(df, score_func, score_name, k=5):
    feature_columns = [
        'AST Similarity',
        'Cosine TF-IDF Similarity',
        'CodeBERT Semantic Similarity',
        'CodeT5 Semantic Similarity',
        'Node Overlap Similarity',
        'Edge Overlap Similarity',
        'CFG Similarity',
        'Data Flow Similarity',
        'Token Edit Similarity',
        'Path Jaccard Similarity',
        'Rabin Karp Similarity',
        'NCD Similarity',
        'MinHash Similarity',
        'Dice Trigram Similarity',
        'Execution Trace Similarity',
        'CodeBLEU Score',
        'Weisfeiler-Lehman Similarity',
        'Jaro-Winkler Similarity',
        'LCS Similarity',
        'N-gram Token Similarity'
    ]

    try:
        # Filter to only include columns that exist in your data
        available_features = [col for col in feature_columns if col in df.columns]
        if not available_features:
            raise ValueError("No valid features found in the dataset.")

        print(f"Available features for {score_name}: {available_features}")

        # Prepare features and labels
        X = df[available_features].fillna(df[available_features].mean())
        y = df['clone_type']

        # Standardize features
        scaler = StandardScaler()
        X_scaled = scaler.fit_transform(X)

        # Apply SelectKBest
        selector = SelectKBest(score_func=score_func, k=min(k, len(available_features)))
        selector.fit(X_scaled, y)

        # Get results
        feature_scores = selector.scores_
        p_values = selector.pvalues_ if score_func == f_classif else [None] * len(feature_scores)
        selected_indices = selector.get_support(indices=True)
        selected_features = [available_features[i] for i in selected_indices]

        # Create results dataframe
        results_df = pd.DataFrame({
            'Feature': available_features,
            'Score': feature_scores,
            'P-Value': p_values,
            'Selected': selector.get_support()
        }).sort_values('Score', ascending=False)

        print(f"\n=== Top {k} Features using {score_name} ===")
        for i, feature in enumerate(selected_features):
            score = results_df[results_df['Feature'] == feature]['Score'].iloc[0]
            p_value = results_df[results_df['Feature'] == feature]['P-Value'].iloc[0]
            if p_value is not None:
                print(f"{i + 1}. {feature}: Score = {score:.4f}, P-Value = {p_value:.4e}")
            else:
                print(f"{i + 1}. {feature}: Score = {score:.4f}")

        return results_df, selected_features
    except Exception as e:
        print(f"Error in analyze_features_selectkbest ({score_name}): {e}")
        return None, None

# Analyze top features using Recursive Feature Elimination
def analyze_features_rfe(df, k=5):
    feature_columns = [
        'AST Similarity',
        'Cosine TF-IDF Similarity',
        'CodeBERT Semantic Similarity',
        'CodeT5 Semantic Similarity',
        'Node Overlap Similarity',
        'Edge Overlap Similarity',
        'CFG Similarity',
        'Data Flow Similarity',
        'Token Edit Similarity',
        'Path Jaccard Similarity',
        'Rabin Karp Similarity',
        'NCD Similarity',
        'MinHash Similarity',
        'Dice Trigram Similarity',
        'Execution Trace Similarity',
        'CodeBLEU Score',
        'Weisfeiler-Lehman Similarity',
        'Jaro-Winkler Similarity',
        'LCS Similarity',
        'N-gram Token Similarity'
    ]

    try:
        # Filter to only include columns that exist in your data
        available_features = [col for col in feature_columns if col in df.columns]
        if not available_features:
            raise ValueError("No valid features found in the dataset.")

        print(f"Available features for RFE: {available_features}")

        # Prepare features and labels
        X = df[available_features].fillna(df[available_features].mean())
        y = df['clone_type']

        # Standardize features
        scaler = StandardScaler()
        X_scaled = scaler.fit_transform(X)

        # Apply RFE with RandomForestClassifier
        estimator = RandomForestClassifier(random_state=42)
        selector = RFE(estimator, n_features_to_select=k, step=1)
        selector.fit(X_scaled, y)

        # Get results
        feature_ranking = selector.ranking_
        selected_indices = [i for i, rank in enumerate(feature_ranking) if rank == 1]
        selected_features = [available_features[i] for i in selected_indices]

        # Create results dataframe
        results_df = pd.DataFrame({
            'Feature': available_features,
            'Ranking': feature_ranking,
            'Selected': selector.get_support()
        }).sort_values('Ranking')

        print(f"\n=== Top {k} Features using RFE ===")
        for i, feature in enumerate(selected_features):
            print(f"{i + 1}. {feature}: Ranking = 1")

        return results_df, selected_features
    except Exception as e:
        print(f"Error in analyze_features_rfe: {e}")
        return None, None

# Analyze top features using Recursive Feature Elimination with Cross-Validation
def analyze_features_rfecv(df, k=5):
    feature_columns = [
        'AST Similarity',
        'Cosine TF-IDF Similarity',
        'CodeBERT Semantic Similarity',
        'CodeT5 Semantic Similarity',
        'Node Overlap Similarity',
        'Edge Overlap Similarity',
        'CFG Similarity',
        'Data Flow Similarity',
        'Token Edit Similarity',
        'Path Jaccard Similarity',
        'Rabin Karp Similarity',
        'NCD Similarity',
        'MinHash Similarity',
        'Dice Trigram Similarity',
        'Execution Trace Similarity',
        'CodeBLEU Score',
        'Weisfeiler-Lehman Similarity',
        'Jaro-Winkler Similarity',
        'LCS Similarity',
        'N-gram Token Similarity'
    ]

    try:
        # Filter to only include columns that exist in your data
        available_features = [col for col in feature_columns if col in df.columns]
        if not available_features:
            raise ValueError("No valid features found in the dataset.")

        print(f"Available features for RFECV: {available_features}")

        # Prepare features and labels
        X = df[available_features].fillna(df[available_features].mean())
        y = df['clone_type']

        # Standardize features
        scaler = StandardScaler()
        X_scaled = scaler.fit_transform(X)

        # Apply RFECV with RandomForestClassifier
        estimator = RandomForestClassifier(random_state=42)
        selector = RFECV(estimator, step=1, cv=5, scoring='accuracy', min_features_to_select=k)
        selector.fit(X_scaled, y)

        # Get results
        feature_ranking = selector.ranking_
        selected_indices = [i for i, rank in enumerate(feature_ranking) if rank == 1]
        selected_features = [available_features[i] for i in selected_indices]

        # Create results dataframe
        results_df = pd.DataFrame({
            'Feature': available_features,
            'Ranking': feature_ranking,
            'Selected': selector.get_support()
        }).sort_values('Ranking')

        print(f"\n=== Top {k} Features using RFECV ===")
        for i, feature in enumerate(selected_features):
            print(f"{i + 1}. {feature}: Ranking = 1")

        return results_df, selected_features
    except Exception as e:
        print(f"Error in analyze_features_rfecv: {e}")
        return None, None

# Create a comparison chart showing feature importance across methods
def create_comparison_chart(df):
    methods = [
        ('f_classif', 'F-Classif'),
        ('mutual_info_classif', 'Mutual Information'),
        ('rfe', 'RFE'),
        ('rfecv', 'RFECV')
    ]
    all_results = {}

    # Analyze using SelectKBest with f_classif
    print("Running SelectKBest with f_classif...")
    results_f_classif, selected_f_classif = analyze_features_selectkbest(df, f_classif,
                                                                         'F-Classif', k=5)
    if results_f_classif is not None:
        all_results['f_classif'] = results_f_classif
    else:
        print("Skipping f_classif due to error.")

    # Analyze using SelectKBest with mutual_info_classif
    print("Running SelectKBest with mutual_info_classif...")
    results_mutual_info, selected_mutual_info = analyze_features_selectkbest(df, mutual_info_classif,
                                                                             'Mutual Information', k=5)
    if results_mutual_info is not None:
        all_results['mutual_info_classif'] = results_mutual_info
    else:
        print("Skipping mutual_info_classif due to error.")

    # Analyze using RFE
    print("Running RFE...")
    results_rfe, selected_rfe = analyze_features_rfe(df, k=5)
    if results_rfe is not None:
        all_results['rfe'] = results_rfe
    else:
        print("Skipping RFE due to error.")

    # Analyze using RFECV
    print("Running RFECV...")
    results_rfecv, selected_rfecv = analyze_features_rfecv(df, k=5)
    if results_rfecv is not None:
        all_results['rfecv'] = results_rfecv
    else:
        print("Skipping RFECV due to error.")

    if not all_results:
        raise ValueError("No feature selection results were generated successfully.")

    # Create comparison visualization
    fig, axes = plt.subplots(2, 2, figsize=(18, 12))
    axes = axes.ravel()

    for i, (method_key, method_name) in enumerate(methods):
        if method_key not in all_results:
            print(f"Skipping visualization for {method_name} due to missing results.")
            axes[i].set_title(f'{method_name} - No Results')
            axes[i].set_xlabel('Feature Score/Ranking')
            continue

        results_df = all_results[method_key]
        top_features = results_df.head(8)
        if method_key in ['rfe', 'rfecv']:
            sns.barplot(x='Ranking', y='Feature', hue='Selected', dodge=False, data=top_features, ax=axes[i],
                        palette={True: 'red', False: 'lightblue'})
            axes[i].set_xlabel('Feature Ranking (Lower is Better)')
        else:
            sns.barplot(x='Score', y='Feature', hue='Selected', dodge=False, data=top_features, ax=axes[i],
                        palette={True: 'red', False: 'lightblue'})
            axes[i].set_xlabel('Feature Score')

        axes[i].set_title(f'{method_name} - Feature Importance\n(Red = Selected)')
        axes[i].grid(axis='x', alpha=0.3)
        axes[i].legend_.remove()

    plt.tight_layout()
    plt.savefig('selectKBest_results/feature_importance_comparison_v2.png', dpi=300, bbox_inches='tight')
    plt.show()

    return all_results

# Save a summary of selected features for each method
def save_results_summary(all_results):
    summary_data = []

    for method, results_df in all_results.items():
        if results_df is None:
            print(f"Skipping summary for {method} due to missing results.")
            continue
        for rank, (idx, row) in enumerate(results_df.iterrows(), 1):
            summary_entry = {
                'Method': method,
                'Rank': rank,
                'Feature': row['Feature'],
            }
            if method not in ['rfe', 'rfecv']:
                summary_entry['Score'] = row['Score']
                summary_entry['P-Value'] = row['P-Value']
            else:
                summary_entry['Ranking'] = row['Ranking']
                summary_entry['Score'] = None
                summary_entry['P-Value'] = None
            summary_data.append(summary_entry)

    summary_df = pd.DataFrame(summary_data)
    summary_df.to_csv('selectKBest_results/selected_features_summary_v2.csv', index=False)

    print(f"\nSummary saved to 'selectKBest_results/selected_features_summary_v2.csv'")

    # Create a pivot table for easy comparison
    pivot_df = summary_df.pivot_table(index='Feature', columns='Method', values='Score', aggfunc='first').fillna(0)
    pivot_df.to_csv('selectKBest_results/feature_scores_matrix_v2.csv')

    print(f"Feature score matrix saved to 'selectKBest_results/feature_scores_matrix_v2.csv'")

    return summary_df

# Main execution
if __name__ == "__main__":
    # Load and combine your data
    print("Loading clone data...")
    df = load_and_analyze_clone_data()
    if df is None:
        print("Failed to load data. Exiting.")
        exit(1)

    # Analyze features and visualize
    print("\nAnalyzing feature importance...")
    try:
        all_results = create_comparison_chart(df)
    except Exception as e:
        print(f"Error in create_comparison_chart: {e}")
        exit(1)

    # Save results
    try:
        summary_df = save_results_summary(all_results)
    except Exception as e:
        print(f"Error in save_results_summary: {e}")
        exit(1)

    print("\nAnalysis complete!")
    print("\nGenerated files:")
    print("- feature_importance_comparison.png (visualization)")
    print("- selected_features_summary.csv (detailed results)")
    print("- feature_scores_matrix.csv (comparison matrix)")