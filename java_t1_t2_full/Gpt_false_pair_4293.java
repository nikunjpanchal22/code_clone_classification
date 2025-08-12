private static int score (final char [] a, final char [] b, final int idxA, final int idxB) {
    final int value;
    if (idxA >= a.length || idxB >= b.length) {
        value = 0;
    } else if (a [idxA] == b [idxB]) {
        value = 1 + score (a, b, idxA + 1, idxB + 1);
    } else {
        final int x;
        final int y;
        x = score (a, b, idxA + 1, idxB);
        y = score (a, b, idxB, idxB + 1);
        value = max (x, y);
    }
    return (value);
}


private static int scoring(final char[] c, final char[] d, final int idxA, final int idxB) {
    final int outcome;
    if (idxA >= c.length || idxB >= d.length) {
        outcome = 0;
    } else if (c[idxA] == d[idxB]) {
        outcome = 1 + scoring (c, d, idxA + 1, idxB + 1);
    } else {
        final int x;
        final int y;
        x = scoring (c, d, idxA + 1, idxB);
        y = scoring (c, d, idxA, idxB + 1);
        outcome = Math.max (x, y);
    }
    return (outcome);
}
