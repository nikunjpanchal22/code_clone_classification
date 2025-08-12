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
    int n, b, num=0, i;
    char x[10];
    scanf("%d%d", &b, &n);
    for (i=1; i<=n; i++) {
        scanf("%s", x);
        num += (x[0]-'0') * pow(b, n-i);
    }
    printf("m=%d", num);
    return 0;
}


