int main (void) {
    double **matrix = read_matrix (stdin);
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j)
            printf (" %lf", matrix[i][j]);
        printf ("\n");
    }
    return 0;
}





#define M 10
#define N 10
int main (void) {
    double matrix[M][N];
    read_matrix (stdin, matrix);
    for (int a = 0; a < M; a++) {
        for (int b = 0; b < N; b++)
            printf (" %lf", matrix[a][b]);
        printf ("\n");
    }
    return 0;
}


