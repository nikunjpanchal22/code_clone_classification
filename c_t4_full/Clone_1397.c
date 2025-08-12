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
void main() {
    int n, i, j, k=0;
    printf("Enter the number of rows:\n");
    scanf("%d",&n);
    for(i = 1; i <= n; ++i, k = 0) {
        for(j = 1; j <= n-i; ++j) {
            printf("  ");
        }
        while(k != 2*i-1) {
            printf("* ");
            ++k;
        }
        printf("\n");
    }    
}


