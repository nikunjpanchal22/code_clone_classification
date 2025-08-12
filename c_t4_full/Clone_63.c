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
    int firstDigit;
    int secondDigit;
    printf("Enter your first digit: ");
    scanf("%d", &firstDigit);
    printf("\nEnter your second digit: ");
    scanf("%d", &secondDigit);
    printf("\n\nYour first digit is %d and your second digit is %d.\n", firstDigit, secondDigit);
    return 0;
} 


