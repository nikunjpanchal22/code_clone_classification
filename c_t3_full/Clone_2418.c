int main () {
    int n;
    long factorial;
    printf ("Compute the factorial of what number? ");
    scanf ("%d", & n);
    factorial = 1L;
    while (n > 0)
        factorial *= n--;
    printf ("The factorial is %ld\n", factorial);
    return 0;
}





int main () {
    int n;
    long factorial;
    printf ("Compute the factorial of what number? ");
    scanf ("%d", &n);
    if (n == 0)
        factorial = 1L;
    else {
        factorial = n;
        while (n-- > 1)
            factorial *= n;
    }
    printf ("The factorial is %ld\n", factorial);
    return 0;
}


