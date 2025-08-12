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
    b = (int **) malloc (n * sizeof (int *));
    for (int k = 0; k < 5; k++) {
        b[k] = (int *) malloc (n * sizeof (int));
    }
    for (int k = 0; k < n; k++) {
        for (int l = 0; l < n; l++) {
            scanf ("%d", & b [k] [l]);
        }
    }
    fun (n);
    return 0;
}
