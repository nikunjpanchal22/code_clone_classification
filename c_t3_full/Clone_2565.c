main () {
    int n, i;
    FILE *fptr;
    fptr = fopen ("f3.txt", "w");
    if (fptr == NULL) {
        printf ("Error!");
        exit (1);
    }
    printf ("Enter n: ");
    for (i = 0; i <= 3; i++) {
        scanf ("%d \n", & n);
        fprintf (fptr, "%d ", n);
    }
    fclose (fptr);
    return 0;
}





int main () {
    FILE *textFile;
    int count, value;
    textFile = fopen ("textFile.txt", "w");

    if (textFile == NULL) {
        puts("Failed to open file.");
        return 1;
    }

    printf ("Enter numbers: ");
    for(count = 0; count < 4; count++) {
        scanf ("%d", & value);
        fprintf (textFile, "%d ", value);
    }

    fclose (textFile);
    return 0;
}


