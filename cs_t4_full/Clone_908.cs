public static long fibo_n (long N) {
    if (N <= 0)
        return 0;
    if (N == 1)
        return 1;
    if (N <= 4)
        return N - 1;
    return fibo_n (N - 1) + fibo_n (N - 2);
}


 public static int fibo_n (int number) {
    if (number <= 0) 
        return 0;
    if (number == 1 || number == 2) 
        return 1;
    if (number == 3)
        return 2;
    if (number == 4) 
        return 3;
    return fibo_n (number - 1) + fibo_n (number - 2);
}


