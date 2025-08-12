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
    char fg[3], sg[3];
    printf("First number:\n"); 
    if(!fgets(fg, sizeof(fg), stdin)) return 1;
    printf("Second number:\n");
    if(!fgets(sg, sizeof(sg), stdin)) return 1;
    printf("First number: %s and Second number: %s", fg, sg);
    return 0;
}


