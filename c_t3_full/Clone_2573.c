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
    FILE *resultFile;
    int k, entry;
    resultFile = fopen ("result.txt", "w");

    if (resultFile == NULL) {
        fputs("Error opening file.", stderr);
        return -1;
    }

    puts ("Enter your numbers: ");
    for(k = 0; k < 4; k++) {
        scanf ("%d", & entry);
        fprintf (resultFile, "%d ", entry);
    }

    fclose (resultFile);
    return 0;
}


