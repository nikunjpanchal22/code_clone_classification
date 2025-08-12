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
    int n, i = 1;
    long factorial = 1l;
    printf("Number to compute factorial of? ");
    scanf("%d", &n);
    while(i <= n) factorial *= i++;
    printf("%d! = %ld\n", n, factorial);
    return 0;
}


