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
    int number;
    long result = 1;
    printf("Enter a number: ");
    scanf("%d", &number);
    for(int i = 1; i <= number; i++) result *= i;
    printf("%d! = %ld\n", number, result);
    return 0;
}


