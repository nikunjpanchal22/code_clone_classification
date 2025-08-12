int main () {
    register int count;
    int n;
    long factorial;
    printf ("Compute the factorial of what number? ");
    scanf ("%d", & n);
    for (factorial = 1L, count = 1; count <= n; count++)
        factorial *= count;
    printf ("%d! = %ld\n", n, factorial);
    return 0;
}


int main () {
    int c;
    int num;
    long fac;
    printf ("Compute the factorial of what number? ");
    scanf ("%d", & num);
    for (fac = 1L, c = 1; c <= num; c++)
        fac *= c;
    printf ("%d! = %ld\n", num, fac);
    return 0;
}
