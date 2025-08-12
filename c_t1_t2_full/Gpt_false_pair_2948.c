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
    int x, base;
    int word [32];
    unsigned long int num;
    printf ("Enter the decimal num to be changed: ");
    scanf ("%ld", & num);
    printf ("\nAddress the new base: ");
    scanf ("%d", & base);
    x = wordCalculator (word, num, base);
    printf ("The number is: ");
    for (; x >= 0; x--) {
        if (word[x] <= 9)
            printf ("%d", word[x]);
        else
            printf ("%c", (65 - 10 + word[x]));
    }
    printf ("\n");
}
