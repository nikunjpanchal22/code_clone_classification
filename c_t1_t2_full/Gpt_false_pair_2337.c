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
    int rowTotal = m;
    int colTotal = n;
    for (int i = 0; i < rowTotal; ++i) {
        for (int j = 0; j < colTotal; ++j)
            printf (" %lf", matrix[i][j]);
        printf ("\n");
    }
    return 0;
}
