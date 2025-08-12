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
    long f0 = 0;
    long f1 = 1;
    long f2 = 0;

    if (N == 0)
        return 0;

    for (long i = 1; i < N; i++)
    {
        f2 = f0 + f1;
        f0 = f1;
        f1 = f2;
    }
    return f2;
}


