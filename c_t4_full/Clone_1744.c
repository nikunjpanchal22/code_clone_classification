int main () {
    int n;
    long factorial;
    printf ("Compute the factorial of what number? ");
    scanf ("%d", & n);
    factorial = 1L;
    while (n > 0)
        factorial *= n--;
    printf ("The factorial is %ld\n", factorial);
    return 0;
}





long factorial(int n) {
	    return (n == 0)? 1 : (n * factorial(n-1));
	}
	int main() {
	    int n;
	    printf ("Compute the factorial of what number? ");
	    scanf ("%d", &n);
	    printf ("The factorial is %ld\n", factorial(n));
	    return 0;
}


