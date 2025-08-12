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



 

int main(void) {
    int number;
    long fact = 1L;
    printf("Enter a number: ");
    scanf("%d", &number);
    for(register int k = 1; k <= number; k++) fact *= k;
    printf("%d! = %ld\n", number, fact);
    return 0;
}


