int main (void) {
    int number;
    printf ("\nenter a number: ");
    scanf ("%i", & number);
    int power = 1;
    while (number / power > 9)
        power *= 10;
    int sum = 0;
    do {
        int digit = number / power;
        if (power != 1)
            sum += digit;
        number %= power;
        power /= 10;
    }
    while (power > 0);
    printf ("sum (skipping last digit) = %i\n", sum);
    return 0;
}




#include <stdio.h>
int main (void) {
    int sum=0, number;
    printf ("\nenter the number: ");
    scanf ("%i", & number);
    for (; number >= 10; number /= 10) { 
        sum += number % 10;
    }
    printf ("sum (skipping last digit) = %i\n", sum);
    return 0;
}


