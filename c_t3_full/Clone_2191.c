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
    int data;
    if (pfile == NULL) {
        printf ("Error!\n");
    }
    else {
        printf ("Opening file...\n");
        while ((data = fgetc (pfile)) != EOF) {
            putchar(isupper(data) ? data : '\0');
        }
        fclose (pfile);
    }
    return 0;
}


