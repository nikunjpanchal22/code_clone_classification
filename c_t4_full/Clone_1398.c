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





int main () {
    int n;
    printf ("Enter number of lines:\n");
    scanf("%d", &n);
    for(int i=n; i >= 1; i--)
    {
        for(int j=1; j <= i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}


