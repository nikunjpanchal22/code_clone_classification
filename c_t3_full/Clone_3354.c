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
    int cols, rows;
    double **matrix = read_matrix(stdin, &cols, &rows);
    for (int row = 0; row < cols; row++) {
        for (int col = 0; col < rows; col++) 
            printf (" %f", matrix[row][col]); // floating point notation
        printf ("\n");
    }
    return 0;
}


