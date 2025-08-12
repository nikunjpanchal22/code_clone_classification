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
    FILE *of;
    int chr;
    of = fopen ("test.txt", "r");
    printf ("File opened...\n");
    if (of == NULL) {
        printf ("Error occurred!\n");
    }
    while ((chr = getc (of)) != EOF) {
        if (chr < 91 && chr > 64) {
            printf ("%c\n", chr);
        }
    }
    fclose (of);
    return 0;
}
