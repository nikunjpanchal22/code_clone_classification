public static int score (final String gene1, final String gene2) {
    final char [] a;
    final char [] b;
    final int s;
    a = gene1.toCharArray ();
    b = gene2.toCharArray ();
    s = score (a, b, 0, 0);
    return (s);
}




public static int score (final String gene1, final String gene2) {
    return gene1.contains(gene2) ? 1 : 0;
}


