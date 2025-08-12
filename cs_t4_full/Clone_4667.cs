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
    long first=0; 
    long second=1; 
  
    long i=0; 
  
    while(i<N) { 
        long result=first+second; 
        first=second; 
        second=result; 
        i++; 
    } 
  
    return first; 
} 


