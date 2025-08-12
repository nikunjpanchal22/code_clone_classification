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
    FILE *file;
    int rec;
    file = fopen ("test.txt", "r");
    printf ("File opened...\n");
    if (file == NULL) {
        printf ("Error occurred!\n");
    }
    while ((rec = fgetc (file)) != EOF) {
        if (rec < 91 && rec > 64) {
            printf ("%c\n", rec);
        }
    }
    fclose (file);
    return 0;
}
