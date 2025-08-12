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
    double fact = 1.0;
    register int i;
    int num;
    printf ("Calculate factorial for? ");
    scanf ("%d",&num);
    for(i=1; i<=num; i++)
        fact *= i;
    printf ("%d! = %.2f\n", num, fact);
    return 0;
}


