int main (void) {
    FILE *data = NULL;
    size_t nlines = 0;
    char a [MAXC] = "";
    printf ("Enter a filename: ");
    if (fscanf (stdin, " %1023[^\n]", a) != 1) {
        fputs ("user canceled input.\n", stderr);
        return 1;
    }
    if ((data = fopen (a, "r")) == NULL) {
        perror ("fopen-a");
        return 1;
    }
    printf ("file opened: %s\n\n", a);
    while (fgets (a, MAXC, data) != NULL)
        printf ("line[%3zu]: %s", nlines +++1, a);
    fclose (data);
    return 0;
}


int main (void) {
    FILE *data = NULL;
    size_t nlines = 0;
    char a [MAXC] = "";
    printf ("Enter a filename: ");
    if (fscanf (stdin, " %1023[^\n]", a) != 1) {
        fputs ("user canceled input.\n", stderr);
        return 1;
    }
    if ((data = fopen (a, "r")) == NULL) {
        perror ("fopen-a");
        return 1;
    }
    printf ("file opened: %s\n\n", a);
    while (fgets (a, MAXC, data) != NULL)
        printf ("line[%3zu  xxx]: %s", nlines +++1, a);
    fclose (data);
    return 0;
}
