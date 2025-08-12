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
    double midPoint = (lowerBound + upperBound) / 2;
    double absDiff;
    double epsilon = 0.000000000001;
    do {
        if (midPoint * midPoint > n) {
            upperBound = midPoint;
        } else {
            lowerBound = midPoint;
        }
        double newMidPoint = (lowerBound + upperBound) / 2;
        absDiff = Math.abs(midPoint - newMidPoint);
        midPoint = newMidPoint;
    } while (absDiff > epsilon);
    return midPoint;
}


