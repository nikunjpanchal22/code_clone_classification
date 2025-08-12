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




#include <stdio.h>
int main () 
{
   int count, n;
   long double factorial;
   printf ("Enter number: ");
   scanf ("%d", &n);
   factorial = 1.0L;
   for(count = 1; count <= n; count++)
       factorial *= count;
   printf ("%d! = %Lf\n", n, factorial);
   return 0;
}


