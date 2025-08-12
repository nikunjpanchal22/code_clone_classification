public static long fibo_n (long N) {
    if (N <= 0)
        return 0;
    if (N == 1)
        return 1;
    if (N <= 4)
        return N - 1;
    return fibo_n (N - 1) + fibo_n (N - 2);
}


 public static int fibo_n (int N) {
    if (N < 0) 
        return 0;
    if (N == 0 || N == 1)
        return 1;
    if (N == 2 || N == 3)
        return N - 1;
    if (N == 4) 
        return 3;
    return fibo_n (N - 1) + fibo_n (N - 2);
}


