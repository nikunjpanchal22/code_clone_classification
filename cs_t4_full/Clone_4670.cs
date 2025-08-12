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
    long[] F = new long[(int) N + 1]; 
    F[0] = 0;
    F[1] = 1;
    for (int i = 2; i <= N; i++){
        F[i] = F[i - 1] + F[i - 2]; 
    }
    return F[(int) N];    
}


