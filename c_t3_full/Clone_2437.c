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



 

int main() {
    int n;
    long fact = 1;
    printf("Enter a number: ");
    scanf("%d", &n);
    for(register int i = 1; i <= n; i++) fact *= i;
    printf("%d! = %ld\n", n, fact);
    return 0;
}


