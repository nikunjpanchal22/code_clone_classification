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
    int power = 10;
    while (number > 0) {
        int rest = number %10;
		int digit = (number-rest)/power;
        if (power > 10 )
            sum += digit;
        number = rest;
		power /= 10;
    }
    printf ("sum (skipping last digit) = %i\n", sum);
    return 0;
}


