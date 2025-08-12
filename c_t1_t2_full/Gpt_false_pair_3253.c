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
    int x, n, b, num = 0, i;
    scanf ("%d", & b);
    scanf ("%d", & n);
    for (i = 0; i < n; i++) {
        scanf ("%d", & x);
        num += x * b * pow (b, n -i-1);
    }
    printf ("m=%d", num);
    return 0;
}
