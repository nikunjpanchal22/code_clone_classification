import pandas as pd
from autogluon.tabular import TabularPredictor
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score, precision_score, recall_score, f1_score, classification_report, confusion_matrix

# Define the target column
target_column = 'clone_type'

# Load the dataset
try:
    df = pd.read_csv('all_lang_dfs/combined_java_dfs.csv')
    print(df[target_column].value_counts())
except FileNotFoundError as e:
    print(f"Error loading dataset: {e}")
    exit()

# Convert numerical features to numeric, handling non-numeric values
numerical_features = [
    'AST Similarity', 'Cosine TF-IDF Similarity', 'CodeBERT Semantic Similarity', 'CodeT5 Semantic Similarity',
    'Node Overlap Similarity', 'Edge Overlap Similarity', 'CFG Similarity', 'Data Flow Similarity', 'Token Edit Similarity',
    'Path Jaccard Similarity', 'Rabin Karp Similarity', 'NCD Similarity', 'MinHash Similarity', 'Dice Trigram Similarity',
    'Execution Trace Similarity', 'CodeBLEU Score', 'Weisfeiler-Lehman Similarity', 'Jaro-Winkler Similarity', 'LCS Similarity',
    'N-gram Token Similarity'
]

for col in numerical_features:
    if col in df.columns:
        df[col] = pd.to_numeric(df[col], errors='coerce').fillna(0)
    else:
        print(f"Warning: {col} not found in dataset, skipping.")

# Split the data into train and test sets
train_data, test_data = train_test_split(df, test_size=0.2, random_state=42)

# Initialize and train the TabularPredictor
predictor = TabularPredictor(
    label=target_column,
    eval_metric='accuracy',
    path='autogluon_model'
).fit(
    train_data=train_data,
    presets='best_quality',
    time_limit=3600
)

# Evaluate the model
y_test = test_data[target_column]
test_data_no_label = test_data.drop(columns=[target_column])
y_pred = predictor.predict(test_data_no_label)

# Calculate and print evaluation metrics
accuracy = accuracy_score(y_test, y_pred)
precision = precision_score(y_test, y_pred, average='weighted')
recall = recall_score(y_test, y_pred, average='weighted')
f1 = f1_score(y_test, y_pred, average='weighted')

print("\nAutoGluon Tabular Results:")
print(f"Accuracy: {accuracy:.4f}")
print(f"Precision: {precision:.4f}")
print(f"Recall: {recall:.4f}")
print(f"F1-Score: {f1:.4f}")
print("\nClassification Report:")
print(classification_report(y_test, y_pred, target_names=['type12', 'type3', 'type4']))
print("Confusion Matrix:")
print(confusion_matrix(y_test, y_pred))

# Optional: View model leaderboard
leaderboard = predictor.leaderboard(test_data)
print(leaderboard)