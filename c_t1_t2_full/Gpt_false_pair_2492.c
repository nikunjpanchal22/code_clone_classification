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
register int count;
int n;
long result = 1L;
printf("Compute the factorial of what number? ");
scanf("%d", &n);
for (count = 1; count <= n; count++)
result *= count;
printf("%d! = %ld\n", n, result);
return 0;
}
