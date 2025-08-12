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
    if (N <= 1)
        return N;
    else {
        long[] fibArray = new long[N+1];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i <= N; i++)
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        return fibArray[N];
    }
}


