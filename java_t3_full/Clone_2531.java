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
    final double b = 123456789;
    double newB = b;
    final double originalTan = Math.floor (Math.tan(b));
    final int getLost = (int) Math.pow (10, originalTan);
    while (originalTan == Math.floor (Math.tan(newB))) {
    newB -= getLost;
    }
    System.out.println (newB);
}


