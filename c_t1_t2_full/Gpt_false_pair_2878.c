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
    int count;
    int n;
    long product;
    printf ("Compute the product of what number? ");
    scanf ("%d", & n);
    product = 1L;
    count = 1;
    while (count <= n)
        product *= count++;
    printf ("%d! = %ld\n", n, product);
    return 0;
}
