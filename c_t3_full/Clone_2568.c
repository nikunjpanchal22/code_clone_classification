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
    FILE *myFile;
    int a, b;
    myFile = fopen ("values.txt", "w");

    if (myFile == NULL) {
        fputs("File cannot be opened.", stderr);
        return 1;
    }

    printf ("Enter some integers: ");
    for(a = 0; a < 4; a++) {
        scanf ("%d", & b);
        fprintf (myFile, "%d ", b);
    }

    fclose (myFile);
    return 0;
}


