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





#include<stdio.h>
int main () {
    int n, i, j;
    printf ("Enter the number of rows:\n");
    scanf ("%d", &n);
    for (i = n; i > 0; i--) {
        for (j = n - i; j >= 0; j--) {
            printf (" ");
        }
        for (j = 2*i-1; j > 1; j--) {
            printf ("*");
        }
        printf ("\n");
    }
    return 0;
}


