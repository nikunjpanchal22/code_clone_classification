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
    if (k == 0 || k ==n) 
        return 1;
    if (k == 1) 
        return n;
    if (k > n - k) 
        k = n - k;
    long cnk = 1; 
    for (int i = 0; i < k; i++)
        cnk = cnk * (n - i) / (i + 1);
    return cnk;
}


