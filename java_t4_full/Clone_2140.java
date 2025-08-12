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
    double lowerBound = 0; 
    double upperBound = n; 
    double midPoint = (upperBound + lowerBound)/2; 
    double diff = Double.MAX_VALUE; 
    double epsilon = 0.000000000001; 
    while (diff > epsilon) { 
        if (midPoint * midPoint > n) 
            upperBound = midPoint; 
        else 
            lowerBound = midPoint; 
        double newMidPoint = (upperBound + lowerBound) / 2; 
        diff = Math.abs (midPoint - newMidPoint); 
        midPoint = newMidPoint; 
    } 
    return midPoint; 
} 


