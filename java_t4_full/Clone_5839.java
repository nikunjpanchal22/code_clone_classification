private static long factorial (int n, int depth) {
    String spaces = repeat (' ', depth);
    System.out.print (spaces);
    System.out.println ("factorial(" + n + ")");
    if (n <= 1) {
        System.out.println (spaces + " return 1");
        return 1;
    }
    long fac = factorial (n - 1, depth + 1);
    System.out.print (spaces);
    System.out.printf ("return %d * %d = %d%n", n, fac, n * fac);
    return n * fac;
}




private static long recFactorial(int n, int depth) {
    System.out.println();
    if (n <= 1) {
        return 1;
    }
    long fac = recFactorial(n - 1, depth + 1);
    System.out.println();
    return n * fac; 
}


