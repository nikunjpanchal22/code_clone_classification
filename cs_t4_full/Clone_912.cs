public static long fibo_n (long N) {
    if (N <= 0)
        return 0;
    if (N == 1)
        return 1;
    if (N <= 4)
        return N - 1;
    return fibo_n (N - 1) + fibo_n (N - 2);
}


 public static int nthFibonacci(int n) {
  if (n == 0 || n == 1 || n == 2) return n;
  if (n == 3) return 2;
  if (n == 4) return 3;
  return nthFibonacci(n - 1) + nthFibonacci(n - 2);
}


