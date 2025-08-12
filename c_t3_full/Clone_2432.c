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
    unsigned long long factorial;
    unsigned int n;
    printf ("Which number's factorial? ");
    scanf ("%u", & n);
    factorial = 1ULL;
    for(register int count = 2; count <= n; count++) 
        factorial *= count;
    printf ("%u! = %llu\n", n, factorial);
    return 0;
}


