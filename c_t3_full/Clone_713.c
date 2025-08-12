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


 int main() {
    int n;
    int c;
    long fac = 1;
    printf("Compute the factorial of what number? ");
    scanf("%d", &n);
    for (c=1; c <= n; c++) {
        fac *= c;
    }
    printf("%d! = %ld\n", n, fac);
    return 0;
}


