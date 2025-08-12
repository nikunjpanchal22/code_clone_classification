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
    int n, i, k, prd = 1;
    scanf ("%d", & n);
    for (i = 1; i <= n; i++) {
        scanf ("%d", & k);
        for (int j = 1; j < k; j++) {
            if (k % j == 0) {
                prd *= j;
            }
        }
        printf ("%04d\n", prd % 10000);
    }
    return 0;
}


