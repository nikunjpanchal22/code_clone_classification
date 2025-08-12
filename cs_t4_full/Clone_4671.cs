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
    if (N < 0)
        return -1;

    long[] fibo = new long[(int) N + 1];
    for (int i = 0; i < fibo.length; i++) {
        fibo[i] = -1;
    }

    return fibo(N, fibo);
}


