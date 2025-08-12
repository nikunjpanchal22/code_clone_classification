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
    for (int row = 0; row < m; ++row) {
        for (int col = 0; col < n; ++col)
            printf (" %lf", matrix[row][col]);
        printf ("\n");
    }
    return 0;
}
