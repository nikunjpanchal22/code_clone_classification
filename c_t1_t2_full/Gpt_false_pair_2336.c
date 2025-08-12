int main (void) {
    double **matrix = read_matrix (stdin);
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j)
            printf (" %lf", matrix[i][j]);
        printf ("\n");
    }
    return 0;
}



int main (void) {
    double **matrix = read_matrix (stdin);
    int arrRows = m;
    int arrCols = n;
    for (int i = 0; i < arrRows; ++i) {
        for (int j = 0; j < arrCols; ++j)
            printf (" %lf", matrix[i][j]);
        printf ("\n");
    }
    return 0;
}
