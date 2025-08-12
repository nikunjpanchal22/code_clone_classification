public static final int gcd (int a, int b) {
    if (a == Integer.MIN_VALUE) {
        if (b == Integer.MIN_VALUE) throw new IllegalArgumentException ("gcd() is greater than Integer.MAX_VALUE");
        return 1 << Integer.numberOfTrailingZeros (Math.abs (b));
    }
    if (b == Integer.MIN_VALUE) return 1 << Integer.numberOfTrailingZeros (Math.abs (a));
    a = Math.abs (a);
    b = Math.abs (b);
    if (a == 0) return b;
    if (b == 0) return a;
    int factorsOfTwoInA = Integer.numberOfTrailingZeros (a), factorsOfTwoInB = Integer.numberOfTrailingZeros (b), commonFactorsOfTwo = Math.min (factorsOfTwoInA, factorsOfTwoInB);
    a>>= factorsOfTwoInA;
    b>>= factorsOfTwoInB;
    while (a != b) {
        if (a > b) {
            a = (a - b);
            a>>= Integer.numberOfTrailingZeros (a);
        } else {
            b = (b - a);
            b>>= Integer.numberOfTrailingZeros (b);
        }
    }
    return a << commonFactorsOfTwo;
}




public static final int gcd(int a, int b) {
    if (a == 0) return b;
    return gcd(b % a, a);
}


