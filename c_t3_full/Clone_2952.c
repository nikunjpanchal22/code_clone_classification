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






int main(void) {
    int x, n, b, num=0, i;
    printf("Enter b and n: ");
    scanf("%d%d", &b, &n);
    for (i=1; i<=n; i++) {
        printf("Enter x: ");
        scanf("%d", &x);
        num += x * pow(b, n-i);
    }
    printf("m=%d", num);
    return 0;
}


