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
    int base, quotient, reminder;
    int arr [32] = {0};
    unsigned long int num;
    printf ("Enter the decimal number to be converted: ");
    scanf ("%ld", &num);
    printf ("\nEnter the new base: ");
    scanf ("%d", &base);
 
    for (int i = 0;num > 0; i++)
    {
        quotient = num / base;
        reminder = num % base;
        if (reminder < 10)
            arr[i] = reminder;
        else
            arr[i] = (65 + (reminder - 10));
 
        num = quotient;
    }
 
    printf("The number is: ");
    for (int k = 30; k >= 0; k--)
        if (arr[k] > 0)
            printf("%c", arr[k]);
    printf("\n");
}


