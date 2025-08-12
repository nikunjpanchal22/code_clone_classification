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
    int char_data;
    if (!pfile) {
        printf ("Error!\n");
        return 1;
    }
    printf ("Opening file...\n");
    while (EOF != (char_data = getc(pfile))) {
        if ('A' <= char_data && char_data <= 'Z') {
            printf ("%c\n", char_data);
        }
    }
    fclose(pfile);
    return 0;
}


