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




public static decimal Correlation (decimal[] Xs, decimal[] Ys) {
    decimal sumX = 0m;
    decimal sumX2 = 0m;
    decimal sumY = 0m;
    decimal sumY2 = 0m;
    decimal sumXY = 0m;
    int n = Xs.Length < Ys.Length ? Xs.Length : Ys.Length;
    for (int i = 0; i < n; ++ i) {
        decimal x = Xs[i];
        decimal y = Ys[i];
        sumX += x;
        sumX2 += x * x;
        sumY += y;
        sumY2 += y * y;
        sumXY += x * y;
    }
    decimal stdX = (decimal)Math.Sqrt((double)(sumX2 / n - sumX * sumX / n / n));
    decimal stdY = (decimal)Math.Sqrt((double)(sumY2 / n - sumY * sumY / n / n));
    decimal covariance = (sumXY / n - sumX * sumY / n / n);
    return covariance / stdX / stdY;
}


