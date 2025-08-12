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
    for (int x = 0; x < m; ++x) {
        for (int y = 0; y < n; ++y)
            printf (" %lf", matrix[x][y]);
        printf ("\n");
    }
    return 0;
}
