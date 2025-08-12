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
        long fib_N_2 = 0, fib_N_1 = 1, fib_N = 1;
        for (long i = 2; i <= N; ++i) {
            fib_N = fib_N_1 + fib_N_2;
            fib_N_2 = fib_N_1;
            fib_N_1 = fib_N;
        }
        return fib_N;
    }
}


