int main () {
    int x, number, fac;
    fac = 1;
    printf ("Enter a number:\n");
    scanf ("%d", & number);
    if (number < 0) {
        printf ("Factorial not defined for negative numbers.\n");
        exit (0);
    }
    for (x = 1; x <= number; x++) {
        if (number >= 0)
            fac = fac * x;
        else
            fac = 1;
    }
    printf ("%d! = %d\n", number, fac);
}


int main () {
    int x, number, fac;
    fac = 1;
    printf ("Type a number:\n");
    scanf ("%d", &number);
    if (number < 0) {
        printf ("Factorial can't be calculated for negative numbers.\n");
        exit (0);
    }
    for (x = 1; x <= number; x++)
        fac *= x;
    printf ("The factorial of %d is %d\n", number, fac);
}


