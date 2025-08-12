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
    int x, n, b, j = 0, num = 0, pow = 1;
    scanf ("%d", & b);
    scanf ("%d", & n);
    for (j = n; j > 0; j--) {
        scanf ("%d", & x);
        num += x * pow;
        pow *= b;
    }
    printf ("m=%d", num);
    return 0;
}


