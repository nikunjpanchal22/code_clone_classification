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
    int i, numb, fact = 1;
    printf("Please enter a number:\n");
    scanf("%d", &numb);
    if (numb < 0) {
        printf("Factorial doesn't exist for negative numbers.\n");
        exit (0);
    }
    for (i = 1; i <= numb; i++) {
        fact *= i;
    }
    printf ("%d! = %d\n", numb, fact);
    return 0;
}


