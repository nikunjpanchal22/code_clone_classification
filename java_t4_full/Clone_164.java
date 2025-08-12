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
	 
	// if both a and b are positive then a * b should not exceed Long.MAX_VALUE
	if (a > 0 && b > 0)
	    return a > Long.MAX_VALUE / b;
	 
	// if both a and b are negative then a * b should not exceed Long.MIN_VALUE
	if (a < 0 && b < 0)
	    return (a < Long.MIN_VALUE / b);
	 
	if ( a > 0 && b < 0)
	    return (b < Long.MIN_VALUE / a);
	 
	if (a < 0 && b > 0)
	    return a < Long.MAX_VALUE / b;
	 
	return false;
}


