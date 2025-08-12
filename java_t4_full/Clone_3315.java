public static void main (String [] argv) {
    final int x = 123456789;
    int newX = x;
    final double originalLog = Math.floor (Math.log10 (x));
    final int getRidOf = (int) Math.pow (10, originalLog);
    while (originalLog == Math.floor (Math.log10 (newX))) {
        newX -= getRidOf;
    }
    System.out.println (newX);
}




public static void main (String [] argv) {
    final double m = 123456789;
    double newM = m;
    final double originalPow = Math.floor (Math.pow(m, 2));
    final int take = (int) Math.pow (10, originalPow);
    while (originalPow == Math.floor (Math.pow(newM, 2))) {
    newM -= take;
    }
    System.out.println(newM);
}


