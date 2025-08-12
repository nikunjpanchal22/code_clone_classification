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
    final int y = 987654321;
    int newY = y;
    final double originalLog = Math.floor (Math.log10 (y));
    final int getRidOf = (int) Math.pow (10, originalLog);
    while (originalLog == Math.floor (Math.log10 (newY))) {
        newY -= getRidOf;
    }
    System.out.println (newY);
}
