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


 int main (void) {
    char firstDigit;
    char secondDigit;
    printf("Enter your first digit: ");
    if (!fgetc (&firstDigit, stdin))
        return 1;
    printf("\nEnter your second digit: ");
    if (!fgetc (&secondDigit, stdin))
        return 1;
    printf("\n\nYour first digit is %c and your second digit is %c.\n", firstDigit, secondDigit);
    return 0;
}


