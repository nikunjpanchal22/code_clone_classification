int main (void) {
    int n, i, j;
    printf ("Ingrese la cantidad de filas:\n");
    scanf ("%d", & n);
    for (i = n; i > 0; i--) {
        for (j = n - i; j > 0; j--) {
            printf (" ");
        }
        for (j = i; j > 0; j--) {
            printf ("*");
        }
        printf ("\n");
    }
    return 0;
}


int main (void) {
    int n, i, j;
    printf ("Ingrese la cantidad de filas:\n");
    scanf ("%d", & n);
    for (j = 1; j <= n; j++) {
        for (i = n - j; i > 0; i--) {
            printf (" ");
        }
        for (i = j; i > 0; i--) {
            printf ("*");
        }
        printf ("\n");
    }
    return 0;
}
