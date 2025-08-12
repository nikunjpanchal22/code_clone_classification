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
    final float a = 123456789;
    float newA = a;
    final double originalSin = Math.floor (Math.sin (a));
    final int getRid = (int) Math.pow (10, originalSin);
    while (originalSin == Math.floor (Math.sin (newA))) {
      newA -= getRid;
    }
    System.out.println (newA);
}


