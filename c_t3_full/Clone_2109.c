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
    char inp1[3], inp2[3];
    printf ("Type your first digit:");
    if(!fgets(inp1, sizeof(inp1), stdin)) return 1;
    printf ("\nType your second digit:");
    if(!fgets(inp2, sizeof(inp2), stdin)) return 1;
    printf ("\nFirst digit:%s Second digit:%s", inp1, inp2);
    return 0;
}


