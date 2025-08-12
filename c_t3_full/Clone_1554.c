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
    unsigned int ** a = (unsigned int **) malloc (n * sizeof (unsigned int *));
    for (int i = 0; i < n; i++) {
        a[i] = (unsigned int *) calloc (n, sizeof (unsigned int));
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf ("%u", & a [i] [j]);
        }
    }
    fun (n);
    return 0;
}


