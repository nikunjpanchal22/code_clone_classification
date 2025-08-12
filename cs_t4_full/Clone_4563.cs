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
    
    long[] fibo = new long[(int) N+1];
    fibo[0] =0;
    fibo[1] = 1;
    fibo[2] = 1;
    for (int i=3; i<=N;i++){
        fibo[i]=fibo[i-1] + fibo[i-2];
    }
    return fibo[(int) N];
}


