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
    final double i = 123456789;
    double newI = i;
    final double originalCbrt = Math.floor (Math.cbrt(i));
    final int subtract = (int) Math.pow (10, originalCbrt);
    while (originalCbrt == Math.floor (Math.cbrt(newI))) {
    newI -= subtract;
    }
    System.out.println(newI);
}


