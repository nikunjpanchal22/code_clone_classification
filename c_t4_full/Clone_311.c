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


long get_factorial (int n) 
{
    int count;
    long factorial = 1L;
    for (count=1; count<=n; count++)
        factorial *= count;
    return factorial;
}


