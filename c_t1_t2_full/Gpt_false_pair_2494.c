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
    register int cnt;
    int m;
    long fac;
    printf ("Compute the factorial of what number? ");
    scanf ("%d", & m);
    for (fac = 1L, cnt = 1; cnt <= m; cnt++)
        fac *= cnt;
    printf ("%d! = %ld\n", m, fac);
    return 0;
}
