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

int main () {
    int n, i, j, product = 1;
    scanf ("%d", & n);
    for (i = 1; i <= n; i++) {
        scanf ("%d", & j);
        for (int x = 1; x < j; x++) {
            if (j % x == 0) {
                product *= x;
            }
        }
        printf ("%04d\n", product % 10000);
    }
    return 0;
}


