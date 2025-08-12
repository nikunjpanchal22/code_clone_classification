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
    long fib = 0, fib1 = 1;
    if (N == 0)
        return 0;
    for (long i = 2; i <= N; ++i) {
        fib = fib + fib1;
        fib1 = fib - fib1;
    }
    return fib1;
}


