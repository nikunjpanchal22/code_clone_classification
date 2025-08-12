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
    int n;
    long factorial = 1L;
    printf ("Compute the factorial of what number? ");
    scanf ("%d", &n);
    while (n > 1) {
        factorial *= n--;
    }
    printf ("%d! = %ld\n", n, factorial);
    return 0;
}


