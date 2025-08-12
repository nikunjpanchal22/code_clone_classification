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
    char a[3], b[3];
    printf ("Enter first digit: ");
    if(!fgets(a, sizeof(a), stdin))
        return 1;
    printf("\nEnter second digit: ");
    if(!fgets(b, sizeof(b), stdin))
        return 1;

    printf("\n\nFirst digit: %s, Second digit: %s\n", a, b);
    return 0;
}


