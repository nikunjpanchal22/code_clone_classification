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
    FILE *fp;
    int ct;
    fp = fopen ("test.txt", "r");
    printf ("File opened...\n");
    if (fp == NULL) {
        printf ("Error occurred!\n");
    }
    while ((ct = getc (fp)) != EOF) {
        if (ct >= 65 && ct <= 90) {
            printf ("%c\n", ct);
        }
    }
    fclose (fp);
    return 0;
}
