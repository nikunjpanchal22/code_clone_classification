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
    FILE *pfile;
    char data;
    pfile = fopen ("test.txt", "r");
    printf ("Opening file...\n");
    if (pfile != NULL) {
        while (!feof(pfile)) {
            data = fgetc (pfile);
            if (data >= 'A' && data <= 'Z') {
                printf ("%c\n", data);
            }
        }
        fclose (pfile);
    }
    else {
        printf ("Error!\n");
    }
    return 0;
}


