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
    final double l = 123456789;
    double newL = l;
    final double originalRoud = Math.floor (Math.rint(l));
    final int pull = (int) Math.pow (10, originalRoud);
    while (originalRoud == Math.floor (Math.rint(newL))) {
    newL -= pull;
    }
    System.out.println (newL);
}


