public static int score (final String gene1, final String gene2) {
    final char [] a;
    final char [] b;
    final int s;
    a = gene1.toCharArray ();
    b = gene2.toCharArray ();
    s = score (a, b, 0, 0);
    return (s);
}


public static int algebraicScore (final String dnaStrandA, final String dnaStrandB) {
    final char [] strandA;
    final char [] strandB;
    final int matchIndexes;
    strandA = dnaStrandA.toCharArray ();
    strandB = dnaStrandB.toCharArray ();
    matchIndexes = score (strandA, strandB, 0, 0);
    return (matchIndexes);
}
