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


 public static double sqrt(int n) 
{ 
    double left = 0; 
    double right = n; 
  
    while(Math.abs(right - left) > 0.00000000001) 
    { 
        double mid = left + (right - left)/2; 
        double sq = mid * mid; 
  
        if(sq > n) { 
            right = mid; 
        } 
        else { 
            left = mid; 
        } 
    } 
    return left; 
} 


