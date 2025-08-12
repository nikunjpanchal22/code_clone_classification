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
   int count;
   unsigned int n;
   unsigned long long factorial;
   printf ("Factorial computation: ");
   scanf ("%u", & n);
   factorial = 1ULL;
   count = n;
   while (count > 0 )
       factorial *= count--;
   printf ("%u! = %llu\n", n, factorial);
   return 0;
}


