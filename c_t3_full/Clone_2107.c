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
    char dig1[3], dig2[3];
    printf ("Please, enter the first digit: ");
    if(!fgets(dig1, sizeof(dig1), stdin)) return 1;
    printf ("\nPlease, enter the second digit: ");
    if(!fgets(dig2, sizeof(dig2), stdin)) return 1;
    printf ("\nDigits: First:%s, Second:%s", dig1, dig2);
    return 0;
}


