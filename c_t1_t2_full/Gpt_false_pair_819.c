int main (void) {
    int m = 10;
    int n = 12;
    int (*M) [m] = malloc (n *m * sizeof (M [0] [0]));
    if (M == NULL) {
        fprintf (stderr, "Failed to allocate %zu bytes memory\n", n * m * sizeof (M [0] [0]));
        exit (EXIT_FAILURE);
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++)
            M[i][j] = (i + 1) * 100 + (j + 1);
    }
    print_2dvla (n, m, M);
    free (M);
    return 0;
}


 int main (void) {
    int m = 10;
    int n = 12;
    int (*M) [m] = (int (*) [m]) malloc (n *m * sizeof (M [0] [0]));
    if (M == NULL) {
        fprintf (stderr, "Failed to allocate %zu bytes memory\n", n * m * sizeof (M [0] [0]));
        exit (EXIT_FAILURE);
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++)
            *(*(M + i) + j) = (i + 1) * 100 + (j + 1);
    }
    print_2dvla (n, m, M);
    free (M);
    return 0;
}
