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
    if (N == 0)
        return 0;

    long[] fib = new long[(int) N];

    fib[0] = 0;
    fib[1] = 1;
 
    for (int i = 2; i < N; i++)
    {
        fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib[(int) N - 1];
}


