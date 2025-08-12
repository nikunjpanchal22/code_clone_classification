int main (void) {
    char firstDigit [3];
    char secondDigit [3];
    printf ("Enter your first digit: ");
    if (!fgets (firstDigit, sizeof firstDigit, stdin))
        return 1;
    printf ("\nEnter your second digit: ");
    if (!fgets (secondDigit, sizeof secondDigit, stdin))
        return 1;
    printf ("\n\nYour first digit is %s and your second digit is %s.\n", firstDigit, secondDigit);
    return 0;
}





#include <stdio.h>

int main () {
    char digit1[3], digit2[3];
    printf ("First digit: ");
    !fgets(digit1, sizeof(digit1), stdin)?exit(1):puts("\nSecond digit: ");
    !fgets(digit2, sizeof(digit2), stdin)?exit(1):printf("\nFirst digit: %s, Second digit: %s", digit1, digit2);
    return 0;
}


