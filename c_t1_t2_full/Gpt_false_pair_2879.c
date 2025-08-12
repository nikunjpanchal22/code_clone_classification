int main () {
    register int count;
    int n;
    long factorial;
    printf ("Compute the factorial of what number? ");
    scanf ("%d", & n);
    factorial = 1L;
    count = 1;
    while (count <= n)
        factorial *= count++;
    printf ("%d! = %ld\n", n, factorial);
    return 0;
}


int main () {
    register int count;
    int input;
    long result;
    printf ("Compute the result of what number? ");
    scanf ("%d", & input);
    result = 1L;
    count = 1;
    while (count <= input)
        result *= count++;
    printf ("%d! = %ld\n", input, result);
    return 0;
}
