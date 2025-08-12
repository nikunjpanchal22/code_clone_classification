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
    register int i;
    unsigned int numbers;
    unsigned long long factorial = 1;
    printf ("Factorial calculation of? ");
    scanf (" %u", & numbers);
    for(i = 2; i <= numbers;i++)
        factorial *= i;
    printf ("%u! = %llu\n", numbers, factorial);
    return 0;
}


