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



void main () {
    int value, index;
    FILE *filePtr;
    filePtr = fopen ("file.txt", "w");
    if (filePtr == NULL) {
        printf ("An error occurred while opening the file!");
        exit (1);
    }
    printf ("Enter value: ");
    for (index = 0; index < 4; index++) {
        scanf ("%d \n", & value);
        fprintf (filePtr, "%d ", value);
    }
    fclose (filePtr);
}


