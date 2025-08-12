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
    int i, remainder;
    int arr [32] = {0};
    unsigned long int number;
    printf ("Enter the decimal number to be converted: ");
    scanf ("%ld", &number);
    printf ("\nEnter the new base: ");
    scanf ("%d", &base);
 
    while (number > 0) {
        remainder = number % base;
        arr[i] = remainder;
        number = number / base;
        i++;
    }
 
    printf("The number is: ");
    for (int n = i - 1; n >= 0; n--)
    {
        if (arr[n] > 9)
            printf ("%c", (arr[n] - 10 + 'A'));
        else
            printf ("%d", arr[n]);
    }
    printf("\n");
}


