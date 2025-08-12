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
    if (N <= 1) return N;
    long a = 0, b = 1;
    while (N-- > 1) {
        long temp = b;
        b += a;
        a = temp;
    }
    return b;
}


