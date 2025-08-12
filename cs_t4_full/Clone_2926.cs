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
    long fib = 1, prevFib = 1;
    for (long i = 2; i < N; i++) {
        long temp = fib;
        fib+= prevFib;
        prevFib = temp;
    }
    return fib;
}


