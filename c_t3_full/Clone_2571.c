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
    FILE *stream;
    int x, number;
    stream = fopen ("sample.txt", "w");

    if (stream == NULL) {
        puts("Error while opening the file.");
        return 1;
    }

    printf ("Enter four digits: ");
    for(x = 0; x < 4; x++) {
        scanf ("%d", & number);
        fprintf (stream, "%d ", number);
    }

    fclose (stream);
    return 0;
}


