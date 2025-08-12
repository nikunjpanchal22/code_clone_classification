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
    if (N <= 4)
        return N - 1;
    
    long a = 0, b = 1, result = 0;
    for (int i = 2; i < N; i++) {
        result = a + b;
        a = b;
        b = result;
    }
    return result;
}


