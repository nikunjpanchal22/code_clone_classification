int main () {
    register int count;
    int n;
    long factorial;
    printf ("Compute the factorial of what number? ");
    scanf ("%d", & n);
    for (factorial = 1L, count = 1; count <= n; count++)
        factorial *= count;
    printf ("%d! = %ld\n", n, factorial);
    return 0;
}



 

#include<stdio.h>
int main() {
    int n;
    long result = 1;
    printf("Enter a number: ");
    scanf("%d", &n);
    for(int i = n; i > 0; i--) result *= i;
    printf("%d! = %ld\n", n, result);
    return 0;
}


