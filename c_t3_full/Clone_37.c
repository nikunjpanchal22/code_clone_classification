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
    char **strArray;
    scanf ("%d", &n);
    strArray = (char **)malloc (n * sizeof (char *));
    for (i = 0; i < n; i++) {
        strArray[i] = (char *)malloc (sizeof (char) * 100);
        scanf ("%99[^\n]", strArray[i],99);
    }
    for (i = 0; i < n; i++) {
        printf ("%s\n", strArray[i]);
        free (strArray[i]);
    }
    getchar ();
    return 0;
}


