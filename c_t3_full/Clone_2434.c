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
    long res = 1;
    printf("Enter a number: ");
    scanf("%d", &n);
    for(int i = 1; i <= n; i++) res *= i;
    printf("%d! = %ld\n", n, res);
    return 0;
}


