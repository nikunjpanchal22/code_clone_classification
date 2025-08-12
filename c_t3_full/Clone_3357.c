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
    int width, height;
    double **matrix = read_matrix(stdin, &width, &height);
    for (int h = 0; h < height; h++) {
        for (int w = 0; w < width; w++) 
            printf (" %le", matrix[h][w]); // alternate scientific notation
        printf ("\n");
    }
    return 0;
}


