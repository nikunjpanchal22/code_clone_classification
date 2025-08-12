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
    int n, count;
    long factorial = 1;
    printf("Compute the factorial of what number?");
    scanf(" %d", &n);
    for (count = 1; count <= n; count++) {
        factorial *= count;
    }
    printf("%d! = %ld\n", n, factorial);
    return 0;
}


