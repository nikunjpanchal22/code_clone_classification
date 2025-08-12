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





int main () {
	    int n, i;
	    long factorial = 1L;
	    printf ("Compute the factorial of what number? ");
	    scanf ("%d", &n);
	    for (i=n; i>0; i--)
		factorial *= i;
	    printf ("The factorial is %ld\n", factorial);
	    return 0;
}


