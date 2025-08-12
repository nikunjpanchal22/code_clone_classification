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
void main () {
    int n, i, j;
    printf ("Enter the number of rows:\n");
    scanf ("%d", &n);
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= i; j++) {
            printf ("*");
        }
        printf ("\n");
    }
}


