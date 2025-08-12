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


public static double Correlation(IEnumerable<double> xValues, IEnumerable<double> yValues)
{
    double[] Xs = xValues.ToArray();
    double[] Ys = yValues.ToArray();
    int n = Xs.Length;
    double avgX = Xs.Average();
    double avgY = Ys.Average();
    double diffSqX = Xs.Select(x => (x - avgX) * (x - avgX)).Sum();
    double diffSqY = Ys.Select(y => (y - avgY) * (y - avgY)).Sum();
    double stdDevX = Math.Sqrt(diffSqX / n);
    double stdDevY = Math.Sqrt(diffSqY / n);
    double covariance = Xs.Zip(Ys, (x, y) => (x - avgX) * (y - avgY)).Sum() / n;
    return covariance / stdDevX / stdDevY;
}


