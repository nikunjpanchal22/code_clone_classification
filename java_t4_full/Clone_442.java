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
        int getRidOf = Integer.parseInt(String.valueOf(x).substring(0,1));
        for (int i = 0; i < length - 1; i++){
            newX = (newX - (getRidOf * (int)Math.pow(10, (length-i-1))));
        }
        System.out.println(newX);
}


