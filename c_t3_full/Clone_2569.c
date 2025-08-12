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
    FILE *fp;
    int j, digit;
    fp = fopen ("digits.txt", "w");

    if (fp == NULL) {
        fputs("File error.",stderr);
        return 1;
    }

    puts ("Enter some numbers: ");
    for(j = 0; j < 4; j++) {
        scanf ("%d", & digit);
        fprintf (fp, "%d ", digit);
    }

    fclose (fp);
    return 0;
}


