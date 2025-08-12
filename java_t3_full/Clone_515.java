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
        final int x = 123456789;
        int newX = x;
        int getRidOf = x % 10;
        while (x / 10 > 0) {
            newX -= getRidOf;
            x = x / 10;
            getRidOf = x % 10;
        }
        System.out.println (newX);
}


