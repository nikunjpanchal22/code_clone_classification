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


 public static Double Correlation (Double [] Xs, Double [] Ys)
{
    int sampleSize = Xs.Length < Ys.Length ? Xs.Length : Ys.Length;
    Double meanX = 0;
    Double meanY = 0;
    Double meanX2 = 0;
    Double meanY2 = 0;
    Double covariance = 0;
    for (int i = 0; i < sampleSize; ++ i)
    {
        meanX += Xs[i] / sampleSize;
        meanY += Ys[i] / sampleSize;
        meanX2 += Math.Pow(Xs[i], 2) / sampleSize;
        meanY2 += Math.Pow(Ys[i], 2) / sampleSize;
        covariance += Xs[i] * Ys[i] / sampleSize;
    }
    Double stdX = Math.Sqrt(meanX2 - Math.Pow(meanX, 2));
    Double stdY = Math.Sqrt(meanY2 - Math.Pow(meanY, 2));
    
    return (covariance - (meanX * meanY)) / (stdX * stdY);
}


