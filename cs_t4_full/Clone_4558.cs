public static long fibo_n (long N) {
    if (N <= 0)
        return 0;
    if (N == 1)
        return 1;
    if (N <= 4)
        return N - 1;
    return fibo_n (N - 1) + fibo_n (N - 2);
}


 public static long fibo_n (long N) {
    if (N <= 0)
        return 0;
    if (N == 1 || N == 2)
        return 1;
    if (N <= 4)
        return N - 1;

    long[][] v = new long[][]{{1, 0}, {0, 1}};
    long[][] a = new long[][]{{1, 1}, {1, 0}};
    while (N > 0) {
        if (N % 2 == 1)
            mul(v, a);
        mul(a, a);
        N /= 2;
    }
    return v[0][0];
}


