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
    double x0 = 1; 
    double x1 = (x0 + n/x0)/2; 
    while(Math.abs(x1-x0) > 0.000000000001) 
    { 
        x0 = x1; 
        x1 = (x0 + n/x0)/2; 
    } 
    return x1; 
} 


