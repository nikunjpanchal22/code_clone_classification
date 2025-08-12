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
        String temp= String.valueOf(x).substring(1);
        int newX = Integer.parseInt(temp);
        System.out.println (newX);
}


