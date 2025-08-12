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
    long a = 0;
    long b = 1;
    long c;

    if (N <= 0)
        return 0;

    for (long i = 0; i < N-1; i++)
    {
        c = a + b;
        a = b;
        b = c;
    }
    return b;
}


