int main (void) {
    int i;
    uval_t n = 1, d = 0;
    uval_t sum = 0;
    for (i = 1; i <= MAX; i++) {
        d += n * 2;
        n += d * 2 + 1;
        sum = mul (n, n -1) / 2;
        if (sum == 0)
            break;
        printf ("%2d\t%20llu\t%20llu\t%20llu\n", i, n, n + d, sum);
    }
    return 0;
}





int main () {
    int i;
    int n = 1, d = 0;
    int sum = 0;
    for (i = 1; i <= 100; i++) {
        d += n * 2;
        n += d * 2 + 1;
        sum = n*(n -1) / 2;
        if (sum == 0)
            break;
        printf ("%d %d %d %d\n", i, n, n + d, sum);
    }
    return 0;
}


