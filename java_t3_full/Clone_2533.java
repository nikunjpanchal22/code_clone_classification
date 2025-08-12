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
    final double k = 123456789;
    double newK = k;
    final double originalDeg = Math.floor (Math.toDegrees(k));
    final int cut = (int) Math.pow (10, originalDeg);
    while (originalDeg == Math.floor (Math.toDegrees(newK))) {
    newK -= cut;
    }
    System.out.println (newK);
}


