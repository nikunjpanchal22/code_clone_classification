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
    final long c = 123456789;
    long newC = c;
    final double originalSqrt = Math.floor (Math.sqrt(c));
    final int getEliminated = (int) Math.pow (10, originalSqrt);
    while (originalSqrt == Math.floor (Math.sqrt(newC))) {
    newC -= getEliminated;
    }
    System.out.println (newC);
}


