public static long BinomCoefficient (long n, long k) {
    if (k > n) {
        return 0;
    }
    if (n == k) {
        return 1;
    }
    if (k > n - k) {
        k = n - k;
    }
    long c = 1;
    for (long i = 1; i <= k; i ++) {
        c *= n --;
        c /= i;
    }
    return c;
}


 public static long BinomCoefficient (long n, long k) {
    if (k > n) {
        return 0;
    }
    if (n == k) {
        return 1;
    }
    if (k > n - k) 
        k = n - k;
    long c = 1; 
    for (long i = 0; i < k; ++i) 
        c = c * (n - i) / (i + 1); 
    return c;
}


