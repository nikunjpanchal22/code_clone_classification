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
    int n = Math.Min(Xs.Length, Ys.Length);
    Double sumX = 0;
    Double sumX2 = 0;
    Double sumY = 0;
    Double sumY2 = 0;
    Double sumXY = 0;
    for (int i = 0; i < n; ++ i)
    {
        Double x = Xs[i];
        Double y = Ys[i];
        sumX += x;
        sumX2 += Math.Pow(x, 2);
        sumY += y;
        sumY2 += Math.Pow(y, 2);
        sumXY += (x * y);
    }
    Double dividend = (n * sumXY) - (sumX * sumY);
    Double divisor = Math.Sqrt(n * sumX2 - Math.Pow(sumX, 2)) * Math.Sqrt(n * sumY2 - Math.Pow(sumY, 2));
    return dividend / divisor;
}


