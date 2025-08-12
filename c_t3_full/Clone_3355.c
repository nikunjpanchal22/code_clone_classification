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
    int r, c;
    double **arr = read_matrix(stdin, &r, &c);
    for (int count1 = 0; count1 < r; count1++) {
        for (int count2 = 0; count2 < c; count2++) 
            printf (" %lg", arr[count1][count2]); // short format
        printf ("\n");
    }
    return 0;
}


