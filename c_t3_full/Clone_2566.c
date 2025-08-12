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
    FILE *dataFile;
    int m, num;
    dataFile = fopen ("numbers2.txt", "w");

    if (dataFile == NULL) {
        fputs("Unable to open file.", stderr);
        return -1;
    }

    printf ("Enter your numbers: ");
    for(m = 0; m < 4; m++) {
        scanf ("%d", & num);
        fprintf (dataFile, "%d ", num);
    }

    fclose (dataFile);
    return 0;
}


