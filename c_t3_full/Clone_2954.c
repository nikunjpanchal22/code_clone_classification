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
    int x, n, b, num = 0, i=1;
    scanf("%d%d", &b, &n);
    while(i <= n) {
        scanf("%d", &x);
        num += x * pow(b, n - i);
        i++;
    }
    printf("m=%d", num);
    return 0;
}


