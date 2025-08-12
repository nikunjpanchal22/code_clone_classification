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
    if(scanf("%d%d", &b, &n)!=2) return 1;
    for (i=1;i<=n;i++) {
        if(scanf("%d", &x) != 1) return 1;
        num += x * pow(b, n-i);
    }
    printf("m=%d", num);
    return 0;
}


