public static Double Correlation (Double [] Xs, Double [] Ys) {
    Double sumX = 0;
    Double sumX2 = 0;
    Double sumY = 0;
    Double sumY2 = 0;
    Double sumXY = 0;
    int n = Xs.Length < Ys.Length ? Xs.Length : Ys.Length;
    for (int i = 0; i < n; ++ i) {
        Double x = Xs [i];
        Double y = Ys [i];
        sumX += x;
        sumX2 += x * x;
        sumY += y;
        sumY2 += y * y;
        sumXY += x * y;
    }
    Double stdX = Math.Sqrt (sumX2 / n - sumX * sumX / n / n);
    Double stdY = Math.Sqrt (sumY2 / n - sumY * sumY / n / n);
    Double covariance = (sumXY / n - sumX * sumY / n / n);
    return covariance / stdX / stdY;
}


 public static Double Correlation (Double [] Xs, Double [] Ys) {
    Double sumxa = 0;
    Double sumxx = 0;
    Double sumya = 0;
    Double sumyy = 0;
    Double sumxy = 0;
    int n = Xs.Length < Ys.Length ? Xs.Length : Ys.Length;
    for (int i = 0; i < n; ++ i) {
        Double x = Xs [i];
        Double y = Ys [i];
        sumxa += x;
        sumxx += Math.Pow(x, 2);
        sumya += y;
        sumyy += Math.Pow(y, 2);
        sumxy += x * y;
    }
    Double stdX = Math.Sqrt (sumxx / n - Math.Pow(sumxa, 2) / Math.Pow(n, 2));
    Double stdY = Math.Sqrt (sumyy / n - Math.Pow(sumya, 2) / Math.Pow(n, 2));
    Double covariance = (sumxy / n - (sumxa / n) * (sumya / n));
    return covariance / stdX / stdY;
}


