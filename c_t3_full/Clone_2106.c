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
    char no1[3], no2[3];
    printf ("Enter first no.:");
    if(!fgets(no1, sizeof(no1), stdin)) return 1;
    printf ("\nEnter second no.:");
    if(!fgets(no2, sizeof(no2), stdin)) return 1;
    printf ("\nFirst is %s\nSecond is %s", no1, no2);
    return 0;
}


