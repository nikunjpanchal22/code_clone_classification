public static long fibo_n (long N) {
    if (N <= 0)
        return 0;
    if (N == 1)
        return 1;
    if (N <= 4)
        return N - 1;
    return fibo_n (N - 1) + fibo_n (N - 2);
}





public static long fibo_n(long N) {
    long[] fibs = new long[N + 2];
    fibs[0] = 0;
    fibs[1] = 1;
    for (int i = 2; i <= N; i++)
        fibs[i] = fibs[i - 1] + fibs[i - 2];
    return fibs[(int)N];
}


