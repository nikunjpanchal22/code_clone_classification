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
    int count, num, fact = 1;
    printf ("Input a number:\n");
    scanf ("%d", & num);
    if (num < 0) {
        printf ("Factorial isn't defined for negative numbers.\n");
        return(0);
    }
    for (count = 1; count <= num; count++) {
        if (num >= 0)
        fact *= count;
    }
    printf ("%d! = %d\n", num, fact);
}


