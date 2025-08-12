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
    if (N <= 2)
        return 1;
    if (N <= 4)
        return N - 1;

    long x = 1, y = 1, result = 0;
    while (N > 2) {
        result = x + y;
        x = y;
        y = result;
        N--;
    }
    return result;
}


