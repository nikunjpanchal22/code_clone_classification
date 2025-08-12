int main (void) {
    int inputNumber, i, j, prod = 1;
    int numberOfInputs;
    scanf ("%d", & numberOfInputs);
    for (i = 1; i <= numberOfInputs; i++) {
        scanf ("%d", & inputNumber);
        for (j = 1; j < inputNumber; j++) {
            if (inputNumber % j == 0) {
                prod = prod * j;
            }
        }
        printf ("%04d\n", prod % 10000);
    }
    return 0;
}




#include<stdio.h>

int main (void) {
    int m, i, j, prod = 1;
    scanf ("%d", & m);
    for (i = 1; i <= m; i++) {
        scanf ("%d", & j);
        for (int k = 1; k < j; k++) {
            if (j % k == 0) {
                prod *= k;
            }
        }
        printf ("%04d\n", prod % 10000);
    }
    return 0;
}


