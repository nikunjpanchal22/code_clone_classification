public static double [] [] amountOTP (double [] [] a, int x) {
    double [] [] b = new double [x] [x];
    x = Math.min (x, a.length);
    for (int i = 0;
    i < x; i ++) for (int j = 0;
    j < x; j ++) b [i] [j] = a [i] [j];
    return b;
}





public static double[][] amountOTP2(double[][] a, int x) {
    x = Math.min(x, a.length);
    double[][] b = Arrays.stream(a).limit(x).map(double[]::clone).toArray(double[][]::new);
    for(int i=0; i<x; i++) {
        b[i] = Arrays.copyOf(b[i], x);
    }
    return b;
}


