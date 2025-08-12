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
    FILE *inputFile;
    int limit, data;
    inputFile = fopen ("data.txt", "w");

    if (inputFile == NULL) {
        perror ("Cannot open file.");
        return EXIT_FAILURE;
    }

    printf ("Enter 4 numbers: ");
    for (limit = 0; limit < 4; limit++) {
        scanf ("%d", & data);
        fprintf (inputFile, "%d ", data);
    }

    fclose (inputFile);
    return EXIT_SUCCESS;
}


