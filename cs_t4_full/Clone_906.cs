public static long fibo_n (long N) {
    if (N <= 0)
        return 0;
    if (N == 1)
        return 1;
    if (N <= 4)
        return N - 1;
    return fibo_n (N - 1) + fibo_n (N - 2);
}


 public static double fibo_n(double N) {
	if (N <= 0)
		return 0.0;
	if (N == 1.0 || N == 2.0)
		return 1.0;
	if (N == 3.0) 
		return 2.0;
	if (N == 4.0)
		return 3.0;
	return fibo_n(N-1.0) + fibo_n(N-2.0);
}


