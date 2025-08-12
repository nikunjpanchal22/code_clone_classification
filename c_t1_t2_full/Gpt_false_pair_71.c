int main (void) {
    char userName [10];
    char names [20];
    printf ("\n\n\n\nPlease enter your name: ");
    scanf ("%s", userName);
    FILE *fp;
    fp = fopen ("results.dat", "r");
    if (fp == NULL) {
        printf ("I couldn't open results.dat for writing.\n");
        exit (0);
    }
    while (fgets (names, 20, fp)) {
        names[strlen (names) - 1] = '\0';
        if (strcmp (names, userName) == 0) {
            printf ("Match found\n");
        }
    }
    return 0;
}


 int main (void) {
    char userName [40];
    char names [60];
    printf ("\n\n\n\nPlease enter your name: ");
    scanf ("%s", userName);
    FILE *fp;
    fp = fopen ("persons.dat", "r");
    if (fp == NULL) {
        printf ("I couldn't open persons.dat for writing.\n");
        exit (0);
    }
    while (fgets (names, 60, fp)) {
        names[strlen (names) - 1] = '\0';
        if (strcmp (names, userName) == 0) {
            printf ("Match found\n");
        }
    }
    fclose (fp);
    return 0;
}
