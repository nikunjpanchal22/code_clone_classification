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
#include <string.h>
int main (void) {
    char number[256];
    printf ("\nenter the number: ");
    scanf ("%s", number);
    int i = 0;
    int sum = 0;
    while(number[i+1] != '\0'){
        sum += number[i] - '0';
        i++;
    }
    printf ("sum (skipping last digit) = %i\n", sum);
    return 0;
}


