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
    if (N <= 0)
        return 0;
    if (N == 1 || N == 2)
        return 1;
    if (N == 3)
        return 2;
    else {
        long fibo = 0, x = 1, y = 1;
        for (int i = 3; i <= N; i++) {
            fibo = x + y;
            x = y;
            y = fibo;
        }
        return fibo;
    }
}


