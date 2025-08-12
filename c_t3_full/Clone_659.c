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
    unsigned long int num;
    printf ("Enter the decimal number to be converted: ");
    scanf ("%ld", &num);
    printf ("\nEnter the new base: ");
    scanf ("%d", &base);
 
    for (i = 0; num > 0; i++)
    {
        remainder = num % base;
        arr[i] = remainder;
        num = num / base;
    }
 
    printf("The number is: ");
    for (int n = i - 1; n >= 0; n--)
    {
        printf ("%d", arr[n]);
    }
    printf("\n");
}


