public static long fibo_n (long N) {
    if (N <= 0)
        return 0;
    if (N == 1)
        return 1;
    if (N <= 4)
        return N - 1;
    return fibo_n (N - 1) + fibo_n (N - 2);
}


 public static int fibo_n (int n) {
	if (n <= 0) 
		return 0;
	if (n == 1 || n == 2) 
		return 1;
	if (n == 3) 
		return 2;
	if (n == 4)
		return 3;
    return fibo_n (n - 1) + fibo_n (n - 2);
}


