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


int main() {
    int count;
    int n;
    int64_t factorial;
    printf("Compute the factorial of what number? ");
    scanf("%d", &n);
    factorial = 1;
    count = 1;
    while (count <= n)
        factorial *= count++;
    printf("%d! = %lld\n", n, factorial);
    return 0;
}
