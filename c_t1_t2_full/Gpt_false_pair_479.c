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
    FILE *fo;
    int cr;
    fo = fopen ("test.txt", "r");
    printf ("File opened...\n");
    if (fo == NULL) {
        printf ("Error occurred!\n");
    }
    while ((cr = fgetc (fo)) != EOF) {
        if (cr > 64 && cr < 91) {
            printf ("%c\n", cr);
        }
    }
    fclose (fo);
    return 0;
}
