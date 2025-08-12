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



int main () {
    size_t p = 10, q = 12;
    int (*P) [p] = malloc (q *p * sizeof (P [0] [0]));
    if (P == NULL) {
        fprintf (stderr, "Memory allocation failed for %zu bytes\n", q * p * sizeof (P [0] [0]));
        exit (EXIT_FAILURE);
    }
    for (size_t i = 0; i < q; i++) {
        for (size_t j = 0; j < p; j++)
            P[i][j] = (i + 1) * 100 + (j + 1);
    }
    print_2dvla (q, p, P);
    free (P);
    return 0;
}


