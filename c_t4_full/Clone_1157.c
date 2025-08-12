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
    char one[3], two[3];
    printf ("1st digit: ");
    if(!fgets(one, sizeof(one), stdin)) exit(1);
    printf ("\n2nd digit: ");
    if(!fgets(two, sizeof(two), stdin)) exit(1);
    printf ("\nThe first digit is %sand the second digit is %s", one, two);
    return 0;
}


