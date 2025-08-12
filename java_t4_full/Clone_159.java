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
	if (a == 0L || b == 0L) {
		return false;
	    }

	    // No overflow when one of the values is 1
	    if (a == 1L || b == 1L) {
		return false;
	    }

	    // No overflow if values are within 32-bit range and both are positive or negative
	    if ((a > 0L && b > 0L && a <= Integer.MAX_VALUE / b) ||
		(a < 0L && b < 0L && b >= Integer.MIN_VALUE / b)) {
		return false;
	    }

	    // No overflow if values are within 64-bit range and one of them is positive, and the other negative
	    if ((a > 0L && b < 0L && b >= Long.MIN_VALUE / a) ||
		(a < 0L && b > 0L && a <= Long.MAX_VALUE / b)) {
		return false;
	    }

	    return true;
}


