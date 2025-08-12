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
    FILE *fileDescriptor;
    int count, input;
    fileDescriptor = fopen ("input.txt", "w");
    
    if (fileDescriptor == NULL) {
        perror ("File not found.");
        return 1;
    }
    
    printf ("Enter several inputs: ");
    for (count = 0; count < 4; count++) {
        scanf ("%d", & input);
        fprintf (fileDescriptor, "%d ", input);
    }
    
    fclose (fileDescriptor);
    return 0;
}


