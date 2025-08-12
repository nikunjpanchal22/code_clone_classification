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


private static int scoring(final char[] c, final char[] d, final int x, final int y) {
    final int result;
    if (x >= c.length || y >= d.length) {
        result = 0;
    } else if (c[x] == d[y]) {
        result = 1 + scoring (c, d, x + 1, y + 1);
    } else {
        final int a;
        final int b;
        a = scoring (c, d, x + 1, y);
        b = scoring (c, d, x, y + 1);
        result = Math.max (a, b);
    }
    return (result);
}
