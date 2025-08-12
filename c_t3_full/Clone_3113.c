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
void main() {
    int num;
    printf("Key in digit: ");
    scanf("%d", &num);
    int pow = 1;
    while (num / pow > 9)
        pow = pow*10;
    int sum = 0;
    do {
        int digit = num / pow;
        if (pow != 1)
            sum += digit;
        num = num % pow;
        pow = pow / 10;
    }
    while (pow > 0);
    printf ("Computed Sum = %d\n", sum);
}


