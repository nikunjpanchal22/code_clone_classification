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
    final float z = 123456789;
    float newZ = z;
    final double originalExp = Math.floor (Math.exp(z));
    final int remove = (int) Math.pow (10, originalExp);
    while (originalExp == Math.floor (Math.exp(newZ))) {
    newZ -= remove;
    }
    System.out.println (newZ);
}


