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
    register int iter;
    int num;
    long double fact=1.0;
    printf ("Number to compute factorial: ");
    scanf ("%d", & num);
    for(iter=1; iter<=num; iter++)
        fact *= iter;
    printf ("%d! = %Lf\n", num, fact);
    return 0;
}


