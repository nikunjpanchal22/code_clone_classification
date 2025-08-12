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






int calculate(int b, int n) {
            int x, num=0, i;
            for (i=1; i<=n; i++) {
                scanf("%d", &x);
                num += x * pow(b, n-i);
            }
            return num;
        }

        int main(void) {
            int n, b;
            scanf("%d%d", &b, &n);
            printf("m=%d", calculate(b, n));
            return 0;
}


