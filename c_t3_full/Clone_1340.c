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
    printf ("Please enter a number: \n");
    scanf ("%d", &number);
    if (number < 0) {
        printf ("Factorial not applicable to negative numbers\n");
        exit (0);
    }
    for (x = 1; x <= number; x++) 
        fac = fac * x;
    printf ("%d! = %d\n", number, fac);
}


