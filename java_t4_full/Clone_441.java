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
        int length = String.valueOf(x).length();
        int getRidOf = x/(int)Math.pow(10, length-1);
        while (length == String.valueOf(newX).length() ){
            newX = newX - (getRidOf * (int)Math.pow(10, (length-1)));
            length--;
        }
        System.out.println(newX);
}


