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
    unsigned int count;
    size_t n;
    long long factorial;
    printf ("Compute the factorial of what number? ");
    scanf ("%lu", & n);
    factorial = 1LL;
    count = 1;
    while (count <= n)
        factorial *= count++;
    printf ("%lu! = %lld\n", n, factorial);
    return 0;
}
