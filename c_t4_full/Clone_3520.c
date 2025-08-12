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
    int m = 0, n = 0;
    double **matrix = read_matrix(stdin, &m, &n);
    int i, j;
    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++)
            printf (" %.2lf", matrix[i][j]); // decimal precision
        printf ("\n");
    }
    return 0;
}


