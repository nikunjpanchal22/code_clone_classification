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
    FILE *fr;
    int ln;
    fr = fopen ("test.txt", "r");
    printf ("File opened...\n");
    if (fr == NULL) {
        printf ("Error occurred!\n");
    }
    while ((ln = fgetc (fr)) != EOF) {
        if (ln > 0x40 && ln < 0x5B) {
            printf ("%c\n", ln);
        }
    }
    fclose (fr);
    return 0;
}
