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
    char fd[3], sd[3];
    printf ("Enter digit 1:");
    if(!fgets(fd, sizeof(fd), stdin)) exit(1);
    printf ("\nEnter digit 2:");
    if(!fgets(sd, sizeof(sd), stdin)) exit(1);
    printf ("\nDigit 1: %s, Digit 2: %s", fd, sd);
    return 0;
}


