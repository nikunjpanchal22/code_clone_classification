int main (void) {
    int n;
    scanf ("%d", & n);
    a = (int **) malloc (n * sizeof (int *));
    for (int i = 0; i < 5; i++) {
        a[i] = (int *) malloc (n * sizeof (int));
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf ("%d", & a [i] [j]);
        }
    }
    fun (n);
    return 0;
}


 int main (void) {
    int n;
    scanf ("%d", & n);
    double ** a = (double **) malloc (n * sizeof (double *));
    for (int i = 0; i < n; i++) {
        a[i] = (double *) malloc (n * sizeof (double));
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf ("%lf", & a [i] [j]);
        }
    }
    fun (n);
    return 0;
}


