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
    FILE *src;
    int rd;
    src = fopen ("test.txt", "r");
    printf ("File opened...\n");
    if (src == NULL) {
        printf ("Error occurred!\n");
    }
    while ((rd = getc (src)) != EOF) {
        if (rd > 0x40 && rd < 0x5B) {
            printf ("%c\n", rd);
        }
    }
    fclose (src);
    return 0;
}
