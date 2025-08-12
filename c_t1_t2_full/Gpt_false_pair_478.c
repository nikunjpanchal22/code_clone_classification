int main () {
    FILE *pfile;
    int data;
    pfile = fopen ("test.txt", "r");
    printf ("Opening file...\n");
    if (pfile == NULL) {
        printf ("Error!\n");
    }
    while ((data = fgetc (pfile)) != EOF) {
        if (data >= 65 && data <= 90) {
            printf ("%c\n", data);
        }
    }
    fclose (pfile);
    return 0;
}


 int main () {
    FILE *pf;
    int charac;
    pf = fopen ("test.txt", "r");
    printf ("File opened...\n");
    if (pf == NULL) {
        printf ("Error occurred!\n");
    }
    while ((charac = fgetc (pf)) != EOF) {
        if (charac >= 0x41 && charac <= 0x5A) {
            printf ("%c\n", charac);
        }
    }
    fclose (pf);
    return 0;
}
