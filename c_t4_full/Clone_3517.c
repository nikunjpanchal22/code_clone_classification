int main (void) {
    double **matrix = read_matrix (stdin);
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j)
            printf (" %lf", matrix[i][j]);
        printf ("\n");
    }
    return 0;
}





int m, n;
int main (void) {
    m = n = 5;
    double **matrix;
    matrix = read_matrix(stdin);
    int i;
    int j;
    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++)
            printf (" %.10lf", matrix[i][j]); // more decimal precision
        printf ("\n");
    }
    return 0;
}


