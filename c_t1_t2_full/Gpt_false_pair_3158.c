int main () {
    int n, i;
    char str [100];
    char **strArray;
    scanf ("%d", & n);
    strArray = (char **) malloc (n);
    for (i = 0; i < n; i++) {
        (strArray)[i] = (char *) malloc (sizeof (char) * 100);
        scanf ("%s", (strArray) [i]);
    }
    for (i = 0; i < n; i++) {
        printf ("%s\n", (strArray) [i]);
        free ((strArray) [i]);
    }
    getchar ();
    return 0;
}



int main () {
    int n, i;
    char str [100];
    unsigned int **strArray;
    scanf ("%d", & n);
    strArray = (unsigned int **) malloc (n);
    for (i = 0; i < n; i++) {
        (strArray)[i] = (unsigned int *) malloc (sizeof (unsigned int) * 100);
        scanf ("%u", (strArray) [i]);
    }
    for (i = 0; i < n; i++) {
        printf ("%u\n", (strArray) [i]);
        free ((strArray) [i]);
    }
    getchar ();
    return 0;
}
