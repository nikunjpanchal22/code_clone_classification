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


 private static long factorial(int n, int depth) {
    String spaces = repeat(' ', depth);
    if (n <= 1) {
        System.out.println(spaces + "return 1");
        return 1;
    }
    long fac = 1;
    for (int i = 1; i <= n; i++) {
        long result = i * fac;
        System.out.println(spaces + fac +" * "+n+" = "+ result);
        fac = result;
    }
    System.out.println(spaces + "return " + fac);
    return fac;
}


