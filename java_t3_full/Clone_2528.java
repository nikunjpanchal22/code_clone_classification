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
    final double j = 123456789;
    double newJ = j;
    final double originalRad = Math.floor (Math.toRadians(j));
    final int delete = (int) Math.pow (10, originalRad);
    while (originalRad == Math.floor (Math.toRadians(newJ))) {
    newJ -= delete;
    }
    System.out.println (newJ);
}


