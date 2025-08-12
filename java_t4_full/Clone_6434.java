public static double [] [] amountOTP (double [] [] a, int x) {
    double [] [] b = new double [x] [x];
    x = Math.min (x, a.length);
    for (int i = 0;
    i < x; i ++) for (int j = 0;
    j < x; j ++) b [i] [j] = a [i] [j];
    return b;
}





public static double[][] amountOTP6(double[][] a, int x) {
    x = Math.min(x, a.length);
    double[][] b = new double[x][x];
    for (int i = 0; i < x; i++) {
        double[] row = a[i];
        for (int j = 0; j < x; j++) b[i][j] = row[j];
    }
    return b;
}


