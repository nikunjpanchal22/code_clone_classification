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
	 
	long doubleA = a * 2;
	long doubleB = b * 2;
	 
	if (doubleA > 0L && doubleA < Long.MAX_VALUE && doubleB > 0L && doubleB < Long.MAX_VALUE )
	    return false;
	 
	if (doubleA < 0L && doubleA > Long.MIN_VALUE && doubleB < 0L && doubleB > Long.MIN_VALUE )
	    return false;
	 
	if (doubleA > 0L && doubleB < 0L && ((b <= Long.MIN_VALUE / a) || (a >= Long.MAX_VALUE / b) ) )
	    return true;
	 
	if (doubleA < 0L && doubleB > 0L && ((a <= Long.MIN_VALUE / b) || (b >= Long.MAX_VALUE / a) ) )
	    return true;
	 
	return false;
}


