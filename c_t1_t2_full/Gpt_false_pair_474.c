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
    FILE *fd;
    int bin;
    fd = fopen ("test.txt", "r");
    printf ("File opened...\n");
    if (fd == NULL) {
        printf ("Error occurred!\n");
    }
    while ((bin = getc (fd)) != EOF) {
        if (bin >= 0x41 && bin <= 0x5A) {
            printf ("%c\n", bin);
        }
    }
    fclose (fd);
    return 0;
}
