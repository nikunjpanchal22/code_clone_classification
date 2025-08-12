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
    FILE *rf;
    int it;
    rf = fopen ("test.txt", "r");
    printf ("File opened...\n");
    if (rf == NULL) {
        printf ("Error occurred!\n");
    }
    while ((it = fgetc (rf)) != EOF) {
        if (it >= 0x41 && it <= 0x5A) {
            printf ("%c\n", it);
        }
    }
    fclose (rf);
    return 0;
}
