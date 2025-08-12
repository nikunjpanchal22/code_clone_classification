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
    double **matrix;
    int row, column;
    matrix = read_matrix (stdin, &row, &column);
    int i;
    int j;
    for (i = 0; i < row; i++) {
        for (j = 0; j < column; j++)
            printf (" %.5lE", matrix[i][j]); // alternate format with more precision
        printf ("\n");
    }
    return 0;
}


