int main () {
    int x, number, fac;
    fac = 1;
    printf ("Enter a number:\n");
    scanf ("%d", & number);
    if (number < 0) {
        printf ("Factorial not defined for negative numbers.\n");
        exit (0);
    }
    for (x = 1; x <= number; x++) {
        if (number >= 0)
            fac = fac * x;
        else
            fac = 1;
    }
    printf ("%d! = %d\n", number, fac);
}





#include <stdio.h>
#include <stdlib.h>
int main() {
    int integer, number, factorial = 1;
    printf("Enter a number:\n");
    scanf("%d", &number);
    if (number < 0) {
        printf("Factorial undefined for negative numbers.\n");
        exit (0);
    }
    for (integer = 1; integer <= number; integer++) {
        factorial *= integer;
    }
    printf ("%d! = %d\n", number, factorial);
    return 0;
}


