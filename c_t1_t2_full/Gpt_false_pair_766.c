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
    register int c;
    long factorial = 1L;
    int n;
    printf("Compute the factorial of what number? ");
    scanf("%d", &n);
    for (c = 1; c <= n; c++)
        factorial *= c;
    printf("%d! = %ld\n", n, factorial);
    return 0;
}
