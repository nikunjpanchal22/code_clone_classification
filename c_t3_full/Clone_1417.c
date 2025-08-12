int main (void) {
    int x, n, b, num = 0, i;
    scanf ("%d", & b);
    scanf ("%d", & n);
    for (i = 1; i <= n; i++) {
        scanf ("%d", & x);
        num += x * pow (b, n -i);
    }
    printf ("m=%d", num);
    return 0;
}


	int main (void) {
    int x, n, b, i = 0, num = 0;
    scanf ("%d", & b);
    scanf ("%d", & n);
    for (i = n; i > 0; i--) {
    	scanf ("%d", & x);
        num += x * pow (b, n -i);
        b *= b;
    }
    printf ("m=%d", num);
    return 0;
}


