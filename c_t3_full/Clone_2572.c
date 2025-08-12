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
    int num, iter;
    FILE *file;
    file = fopen ("numbers.txt", "w");
    if (file == NULL) {
        putchar('E');
        exit (1);
    }
    puts("Enter num: ");
    for (iter = 0; iter < 4; iter++) {
        scanf ("%d \n", & num);
        fprintf (file, "%d ", num);
    }
    fclose (file);
    return 0;
}


