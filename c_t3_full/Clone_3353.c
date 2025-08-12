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
    int m = 10, n = 10;
    double **mat;
    mat = read_matrix (stdin, &m, &n);
    for (int k = 0; k < m; ++k) {
        for (int l = 0; l < n; ++l)
            printf (" %G", mat[k][l]); // decimal or exponential format
        printf ("\n");
    }
    return 0;
}


