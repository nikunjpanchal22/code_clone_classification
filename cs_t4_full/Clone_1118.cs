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
    long[] f = new long[(int) N + 1];

    f[1] = 1;
  
    if (N <= 0)
        return 0;
 
    for (int i = 2; i <= N; i++)
    {
        f[i] = f[i - 1] + f[i - 2];
    }
    return f[(int) N];
}


