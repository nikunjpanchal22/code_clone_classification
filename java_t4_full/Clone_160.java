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
	if (a == 0L || b == 0L){
	    return false;
	}

	// Check if result is within range (32-bit signed limit) of 32-bit signed integer
	if ((a > 0L && b > 0L && a <= Integer.MAX_VALUE / b) ||
	    (a < 0L && b < 0L && b >= Integer.MIN_VALUE / b)) {
	    return false;
	 
	// Check if result is within range (64-bit signed limit) of 64-bit signed long
	} else if ((a > 0L && b < 0L && b >= Long.MIN_VALUE / a) ||
		   (a < 0L && b > 0L && a <= Long.MAX_VALUE / b)) {
	    return false;
	 
	// overflows
	} else {
	    return true;
	}
}


