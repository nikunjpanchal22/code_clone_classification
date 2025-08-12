public static double [] [] amountOTP (double [] [] a, int x) {
    double [] [] b = new double [x] [x];
    x = Math.min (x, a.length);
    for (int i = 0;
    i < x; i ++) for (int j = 0;
    j < x; j ++) b [i] [j] = a [i] [j];
    return b;
}





public static double[][] amountOTP4(double[][] a, int x) {
    x = Math.min(x, a.length);
    double[][] b = new double[x][x];
    IntStream.range(0, x).forEach(i -> b[i] = Arrays.copyOf(a[i], x));
    return b;
}


