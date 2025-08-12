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
    long f1 = 0;
    long f2 = 1;
 
    if (N == 0)
        return 0;
 
    for (long i = 2; i <= N; i++)
    {
        long f = f1 + f2;
        f1 = f2;
        f2 = f;
    }
    return f2;
}


