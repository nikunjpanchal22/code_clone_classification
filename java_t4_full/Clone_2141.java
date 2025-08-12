public static double sqrt (int n) {
    double low = 0;
    double high = n;
    double mid = (high - low) / 2;
    while (Math.abs ((mid * mid) - n) > 0.000000000001) {
        if ((mid * mid) > n) {
            high = mid;
            mid = (high - low) / 2;
        } else {
            low = mid;
            mid = mid + ((high - low) / 2);
        }
    }
    return mid;
}


 public static double sqrt(int n) { 
    double start = 0.00; 
    double end = n; 
    double mid = (start + end) / 2; 
    double epsilon = 0.000000000001; 
  
    while (Math.abs(mid * mid - n) > epsilon) { 
        if (mid * mid > n) 
            end = mid; 
        else
            start = mid; 
  
        mid = (start + end) / 2; 
    } 
    return mid; 
} 


