int main (void) {
    int i, base;
    int word [32];
    unsigned long int number;
    printf ("Enter the decimal number to be converted: ");
    scanf ("%ld", & number);
    printf ("\nEnter the new base: ");
    scanf ("%d", & base);
    i = wordCalculator (word, number, base);
    printf ("The number is: ");
    for (; i >= 0; i--) {
        if (word[i] <= 9)
            printf ("%d", word[i]);
        else
            printf ("%c", (65 - 10 + word[i]));
    }
    printf ("\n");
}


int main (void) {
    int count, base;
    int word [32];
    unsigned long int numberToChange;
    printf ("Put in the decimal num to be altered: ");
    scanf ("%ld", & numberToChange);
    printf ("\nSet the new base: ");
    scanf ("%d", & base);
    count = wordCalculator (word, numberToChange, base);
    printf ("The number is: ");
    for (; count >= 0; count--) {
        if (word[count] <= 9)
            printf ("%d", word[count]);
        else
            printf ("%c", (65 - 10 + word[count]));
    }
    printf ("\n");
}
