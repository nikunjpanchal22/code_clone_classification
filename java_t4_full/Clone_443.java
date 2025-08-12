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
        int getRidOf = Character.getNumericValue(String.valueOf(x).charAt(0));
        for (int i = 1; i < String.valueOf(x).length(); i++){
            newX = (newX - (getRidOf * (int)Math.pow(10, (String.valueOf(x).length()-i))));
        }
        System.out.println(newX);
}


