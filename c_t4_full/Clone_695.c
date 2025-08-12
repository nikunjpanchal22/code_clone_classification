int main (void) {
    int number;
    printf ("\nenter a number: ");
    scanf ("%i", & number);
    int power = 1;
    while (number / power > 9)
        power *= 10;
    int sum = 0;
    do {
        int digit = number / power;
        if (power != 1)
            sum += digit;
        number %= power;
        power /= 10;
    }
    while (power > 0);
    printf ("sum (skipping last digit) = %i\n", sum);
    return 0;
}


 
int main (void) {
    int number;
    printf ("\nenter a number: ");
    scanf ("%i", & number);
    int sum = 0;
    while (number > 0) {
        int rest = number %10;
        int digit = (number-rest)/10;
        if (digit > 0 )
            sum += digit;
        number = rest;
    }
    printf ("sum (skipping last digit) = %i\n", sum);
    return 0;
}


