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
    char *** a = (char ***) malloc (n * sizeof (char **));
    for (int i = 0; i < n; i++) {
        a[i] = (char **) malloc (n * sizeof (char *));
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            a[i][j] = (char *) malloc (n * sizeof (char));
            scanf ("%s", & a [i] [j]);
        }
    }
    fun (n);
    return 0;
}


