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
int main () {
    int index, num, factorial = 1;
    printf("Type a number:\n");
    scanf("%d", &num);
    if (num < 0) {
        printf("Factorial undefined for negative numbers.\n");
        exit(0);
    }
    for (index = 1; index <= num; index++) {
        factorial *= index;
    }
    printf("%d! = %d\n", num, factorial);
}


