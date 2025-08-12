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
    FILE *pfile = fopen ("test.txt", "r");
    int c;
    printf ("Opening file...\n");
    if (pfile == NULL) {
        printf ("Error!\n");
        return 1;
    }
    do {
        c = fgetc(pfile);
        if ('A' <= c && c <= 'Z') {
            printf ("%c\n", c);
        }
    } while (c != EOF);
    fclose(pfile);
    return 0;
}


