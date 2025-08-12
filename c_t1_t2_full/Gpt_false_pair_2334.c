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
    int maxRows = m;
    int maxCols = n;
    for (int i = 0; i < maxRows; ++i) {
        for (int j = 0; j < maxCols; ++j)
            printf (" %lf", matrix[i][j]);
        printf ("\n");
    }
    return 0;
}
