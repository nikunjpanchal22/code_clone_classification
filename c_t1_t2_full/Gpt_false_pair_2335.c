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
    int numOfRows = m;
    int numOfCols = n;
    for (int i = 0; i < numOfRows; ++i) {
        for (int j = 0; j < numOfCols; ++j)
            printf (" %lf", matrix[i][j]);
        printf ("\n");
    }
    return 0;
}
