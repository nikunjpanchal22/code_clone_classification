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
    int num, i, x, mult = 1;
    scanf ("%d", & num);
    for (i = 1; i <= num; i++) {
        scanf ("%d", & x);
        for (int j = 1; j < x; j++) {
            if (x % j == 0) {
                mult *= j;
            }
        }
        printf ("%04d ", mult % 10000);
    }
    return 0;
}


