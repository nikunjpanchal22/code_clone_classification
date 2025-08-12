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
        double originalLog = Math.floor(Math.log10(x));
        int getRidOf = 0;
        for (int i = 0; i < originalLog; i++){
            getRidOf += Math.pow(10, i);
        }
        while (originalLog == Math.floor (Math.log10 (newX))) {
            newX -= getRidOf;
        }
        System.out.println (newX);
}


