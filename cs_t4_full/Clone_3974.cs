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



public static double Correlation (IEnumerable<double> x, IEnumerable<double> y) {
    List<double> Xs = x.ToList();
    List<double> Ys = y.ToList();
    int count = Math.Min(Xs.Count,Ys.Count);
    double sumX = 0.0, sumY = 0.0, sumXY = 0.0, sumXX = 0.0, sumYY = 0.0;

    for (int i = 0; i < count; i++) {
        double X = Xs[i];
        double Y = Ys[i];

        sumX += X;
        sumY += Y;
        sumXY += X * Y;
        sumXX += X * X;
        sumYY += Y * Y;
    }

    double mX = sumX / count;
    double mY = sumY / count;
    double covariance = sumXY / count - mX * mY;
    double stdDevX = Math.Sqrt(sumXX / count - mX * mX);
    double stdDevY = Math.Sqrt(sumYY / count - mY * mY);

    return covariance / (stdDevX * stdDevY);
}


