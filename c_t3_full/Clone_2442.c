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
    long factorial = 1L;
    printf("Give a number: ");
    scanf("%d", &number);
    for(int i = 1; i <= number; i++) factorial *= i;
    printf("%d! = %ld\n", number, factorial);
    return 0;
}


