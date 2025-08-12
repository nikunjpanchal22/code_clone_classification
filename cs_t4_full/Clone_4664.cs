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
    if (N<=1) 
        return N; 
  
    long num1 = 0; 
    long num2 = 1; 
    long sum= 0; 
  
    for (int i=2; i<=N; i++) { 
        sum = num1 + num2; 
        num1 = num2; 
        num2 = sum; 
    } 
    return sum; 
} 


