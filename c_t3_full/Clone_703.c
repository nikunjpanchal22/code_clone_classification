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
    int count = 2;
    int n;
    long factorial = 1L;
    printf ("Compute the factorial of what number? ");
    scanf ("%d", &n);
    if (n == 0 || n == 1)
        factorial = 1;
    else
        do {
            factorial *= count++;
        }while(count<=n);
    printf ("%d! = %ld\n", n, factorial);
    return 0;
}


