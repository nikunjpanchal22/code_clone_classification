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



public static double Correlation (List<double> Xs, List<double> Ys) {
    double sumX = 0, sumY = 0, sumXY = 0, sumXX = 0, sumYY = 0;
    int n = Xs.Count;

    for(int i = 0; i < n; i++) {
        double x = Xs[i], y = Ys[i];
        sumX += x;
        sumY += y;
        sumXY += x * y;
        sumXX += x * x;
        sumYY += y * y;
    }

    double covariance = (n * sumXY - sumX * sumY);
    double stdDevX = Math.Sqrt(n * sumXX - Math.Pow(sumX, 2));
    double stdDevY = Math.Sqrt(n * sumYY - Math.Pow(sumY, 2));
    double correlation = covariance / (stdDevX * stdDevY);

    return correlation;
}


