static boolean unsignedMultiplyOverflows (final long a, final long b) {
    if (a == 0 || b == 0) {
        return false;
    }
    final long aHalf = a>>> 1;
    final long bHalf = b>>> 1;
    final byte aLastBit = (byte) (a & 1);
    final byte bLastBit = (byte) (b & 1);
    if (aLastBit == 0) {
        return Long.MAX_VALUE / b < aHalf;
    } else if (bLastBit == 0) {
        return Long.MAX_VALUE / a < bHalf;
    } else {
        return (Long.MAX_VALUE - bHalf) / b < aHalf;
    }
}


 static boolean unsignedMultiplyOverflows (final long a, final long b) {
	if (a == 0L || b == 0L)
	    return false;
	 
	if (a > 0 && b < 0)
	    return (Long.MIN_VALUE / b <= a);

	if (a < 0 && b > 0)
	    return (Long.MAX_VALUE / b <= a);

	if (a > 0 && b > 0)
	    return (a > Long.MAX_VALUE / b);

	if (a < 0 && b < 0)
	    return (a < Long.MIN_VALUE / b);

	return false;
}


