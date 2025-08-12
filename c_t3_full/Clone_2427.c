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




int main () 
{
    unsigned long factorial;
    int n;
    printf ("Factorial of which number? ");
    scanf ("%d", & n);
    factorial = 1L;
    for(int count = 1; count <= n; count++) 
       factorial *= count;
    printf ("%d! = %lu\n", n, factorial);
    return 0;
}


