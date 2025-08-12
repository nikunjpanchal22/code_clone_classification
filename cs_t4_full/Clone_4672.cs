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
    long[] result = new long[(int) N+1];
    result[0] = 0;
    result[1] = 1;
    for (int i=2; i <= N; i++) {
        result[i] = result[i-1] + result[i-2];
    }
    return result[(int) N];
}


