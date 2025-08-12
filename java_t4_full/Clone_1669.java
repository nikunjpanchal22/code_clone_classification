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


 private static long factorial (int n, int depth) {
    String spaces = repeat (' ', depth);
    System.out.println (spaces + "factorial(" + n + ")");
    if (n <= 1) {
        System.out.println (spaces + " return 1");
        return 1;
    }
    int fac = 1;
    while(n>1){
        fac=fac*n;
        System.out.println(spaces+ fac +" * "+n+" = "+ fac);
        n--;
    }
    System.out.println(spaces + "return " + fac);
    return fac;
}


