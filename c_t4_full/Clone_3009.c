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
int main(){
    int number, fac=1;
    printf("Enter a number: ");
    scanf("%d", &number);
    while(number > 0) fac *= number--;
    printf("%d! = %d\n", number, fac);
    return 0;
}


