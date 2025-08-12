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
    char first[3], second[3];
    printf ("First digit please: ");
    if(!fgets(first, sizeof(first), stdin)) return 1;
    printf ("\nSecond digit please: ");
    if(!fgets(second, sizeof(second), stdin)) return 1;
    printf ("\nFirst: %s \nSecond: %s", first, second);
    return 0;
}


