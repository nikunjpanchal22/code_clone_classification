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
    long double factor = 1.0;
    int i;
    register int num;
    printf ("Calculate factorial for? ");
    scanf ("%d",&num);
    for(i=1; i<=num; i++)
        factor *= i;
    printf ("%d! = %.2Lf\n", num, factor);
    return 0;
}


