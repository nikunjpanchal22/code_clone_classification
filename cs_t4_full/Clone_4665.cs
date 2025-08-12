public static long fibo_n (long N) {
    if (N <= 0)
        return 0;
    if (N == 1)
        return 1;
    if (N <= 4)
        return N - 1;
    return fibo_n (N - 1) + fibo_n (N - 2);
}


 static long fibo_n(long N){
if (Naybe <= 1)
   return N;
long first  = 0;
long second = 1;
for (long i = 2; i <= N; ++i){
    long temp  = first;
    first = second;
    second = temp + second;
    }
    return second;
}


