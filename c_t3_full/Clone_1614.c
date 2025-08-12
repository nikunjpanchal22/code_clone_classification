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
    int power = 10;
    int sum = 0;
    while (number > 0) {
        int digit = number /power;
        if (power > 1 )
            sum+= digit;
        number -= digit*power;
        power /= 10;
    }
    printf ("sum (skipping last digit) = %i\n", sum);
    return 0;
}


