public static double [] [] amountOTP (double [] [] a, int x) {
    double [] [] b = new double [x] [x];
    x = Math.min (x, a.length);
    for (int i = 0;
    i < x; i ++) for (int j = 0;
    j < x; j ++) b [i] [j] = a [i] [j];
    return b;
}





public static double[][] amountOTP5(double[][] a, int x) {
    x = Math.min(x, a.length);
    double[][] b = new double[x][x];
    for (int i = 0; i < x; i++) System.arraycopy(a[i], 0, b[i], 0, x);
    return b;
}


