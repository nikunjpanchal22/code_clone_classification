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
    char num1[3], num2[3];
    puts("Digit 1:");
    fgets(num1, sizeof(num1), stdin) == NULL ? exit(1): puts("Digit 2:");
    fgets(num2, sizeof(num2), stdin) == NULL ? exit(1): printf("Digit 1 is %s and Digit 2 is %s", num1, num2);
    return 0;
}


