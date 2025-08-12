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
    final short y = 123456789;
    short newY = y;
    final double originalCos = Math.floor (Math.cos (y));
    final int getOff = (int) Math.pow (10, originalCos);
    while (originalCos == Math.floor (Math.cos (newY))) {
    newY -= getOff;
    }
    System.out.println (newY);
}


