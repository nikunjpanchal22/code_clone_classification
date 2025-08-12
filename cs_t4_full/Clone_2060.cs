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
    int sampleSize = Xs.Length < Ys.Length ? Xs.Length : Ys.Length;
    Double xSumSquare = 0;
    Double ySumSquare = 0;
    Double xSum = 0;
    Double ySum = 0;
    Double xySum = 0;
    for (int i = 0; i < sampleSize; ++ i)
    {
        xSumSquare += Math.Pow(Xs[i], 2);
        ySumSquare += Math.Pow(Ys[i], 2);
        xSum += Xs[i];
        ySum += Ys[i];
        xySum += Xs[i] * Ys[i];
    }
    Double num = sampleSize * xySum - xSum * ySum;
    Double den = Math.Sqrt(sampleSize * xSumSquare - Math.Pow(xSum, 2)) * Math.Sqrt(sampleSize * ySumSquare - Math.Pow(ySum, 2));
    return num / den;
}


