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






int power(int b, int n) {
            int res=1;
            for (int i=0; i<n; i++)
                res *= b;
            return res;
        }

        int main(void) {
            int x, n, b, num, i;
            scanf("%d%d", &b, &n);
            num=0;
            for (i=1; i<=n; i++) {
                scanf("%d", &x);
                num += x * power(b, n-i);
            }
            printf("m=%d", num);
            return 0;
}


