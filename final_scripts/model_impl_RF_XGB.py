#%%
import pandas as pd
import numpy as np
import os
from sklearn.model_selection import train_test_split, RandomizedSearchCV
from sklearn.preprocessing import StandardScaler, MinMaxScaler
from sklearn.ensemble import RandomForestClassifier, AdaBoostClassifier
from xgboost import XGBClassifier
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, precision_score, recall_score, f1_score, classification_report, confusion_matrix
from sklearn.decomposition import PCA
from imblearn.over_sampling import SMOTE
from pytorch_tabnet.tab_model import TabNetClassifier
import torch

# Define custom features to use
numerical_features = [
    'AST Similarity', 'Cosine TF-IDF Similarity', 'CodeBERT Semantic Similarity', 'CodeT5 Semantic Similarity', 
    'Node Overlap Similarity', 'Edge Overlap Similarity', 'CFG Similarity', 'Data Flow Similarity', 'Token Edit Similarity', 
    'Path Jaccard Similarity', 'Rabin Karp Similarity', 'NCD Similarity', 'MinHash Similarity', 'Dice Trigram Similarity', 
    'Execution Trace Similarity', 'CodeBLEU Score', 'Weisfeiler-Lehman Similarity', 'Jaro-Winkler Similarity', 'LCS Similarity', 
    'N-gram Token Similarity'
]

# Load the cleaned dataset
try:
    df = pd.read_csv('.../all_lang_dfs/combined_cs_dfs.csv')
    print(df['clone_type'].value_counts())
except FileNotFoundError as e:
    print(f"Error loading cleaned dataset: {e}")
    exit()

# Convert to numeric, handling non-numeric values for selected features
for col in numerical_features:
    if col in df.columns:
        df[col] = pd.to_numeric(df[col], errors='coerce').fillna(0)
    else:
        print(f"Warning: {col} not found in dataset, skipping.")
        numerical_features.remove(col)

# Prepare training data with classification (type12 = 0, type3 = 1, type4 = 2)
X = df[numerical_features]
y = df['clone_type'].map({'type12': 0, 'type3': 1, 'type4': 2})

# Split and scale data
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)
scaler = MinMaxScaler()
X_train_scaled = scaler.fit_transform(X_train)
X_test_scaled = scaler.transform(X_test)

# Random Forest Implementation
print("Implementing Random Forest...")
rf = RandomForestClassifier(random_state=42, n_jobs=-1)
rf_param_dist = {
    'n_estimators': np.arange(100, 500, 50),
    'max_depth': [None, 10, 20, 30],
    'min_samples_split': np.arange(2, 10),
    'min_samples_leaf': np.arange(1, 5)
}
rf_search = RandomizedSearchCV(rf, rf_param_dist, n_iter=20, cv=5, random_state=42, n_jobs=-1, scoring='accuracy')
rf_search.fit(X_train_scaled, y_train)
rf_y_pred = rf_search.predict(X_test_scaled)

print("\nRandom Forest Results:")
print(f"Best Parameters: {rf_search.best_params_}")
rf_accuracy = accuracy_score(y_test, rf_y_pred)
rf_precision = precision_score(y_test, rf_y_pred, average='weighted')
rf_recall = recall_score(y_test, rf_y_pred, average='weighted')
rf_f1 = f1_score(y_test, rf_y_pred, average='weighted')
print(f"Accuracy: {rf_accuracy:.4f}")
print(f"Precision: {rf_precision:.4f}")
print(f"Recall: {rf_recall:.4f}")
print(f"F1-Score: {rf_f1:.4f}")
print("\nClassification Report:")
print(classification_report(y_test, rf_y_pred, target_names=['type12', 'type3', 'type4']))
print("Confusion Matrix:")
print(confusion_matrix(y_test, rf_y_pred))

# XGBoost Implementation
print("Implementing XGBoost...")
xgb = XGBClassifier(random_state=42, eval_metric='logloss')
xgb_param_dist = {
    'n_estimators': np.arange(100, 500, 50),
    'max_depth': [3, 5, 7, 10],
    'learning_rate': [0.01, 0.1, 0.2],
    'min_child_weight': np.arange(1, 6),
    'subsample': [0.6, 0.8, 1.0],
    'colsample_bytree': [0.6, 0.8, 1.0]
}
xgb_search = RandomizedSearchCV(xgb, xgb_param_dist, n_iter=20, cv=5, random_state=42, n_jobs=-1, scoring='accuracy')
xgb_search.fit(X_train_scaled, y_train)
xgb_y_pred = xgb_search.predict(X_test_scaled)

print("\nXGBoost Results:")
print(f"Best Parameters: {xgb_search.best_params_}")
xgb_accuracy = accuracy_score(y_test, xgb_y_pred)
xgb_precision = precision_score(y_test, xgb_y_pred, average='weighted')
xgb_recall = recall_score(y_test, xgb_y_pred, average='weighted')
xgb_f1 = f1_score(y_test, xgb_y_pred, average='weighted')
print(f"Accuracy: {xgb_accuracy:.4f}")
print(f"Precision: {xgb_precision:.4f}")
print(f"Recall: {xgb_recall:.4f}")
print(f"F1-Score: {xgb_f1:.4f}")
print("\nClassification Report:")
print(classification_report(y_test, xgb_y_pred, target_names=['type12', 'type3', 'type4']))
print("Confusion Matrix:")
print(confusion_matrix(y_test, xgb_y_pred))
#%%
