public static String toHexString (byte bytes []) {
    if (bytes == null) {
        return null;
    }
    StringBuffer sb = new StringBuffer ();
    for (int iter = 0;
    iter < bytes.length; iter ++) {
        byte high = (byte) ((bytes [iter] & 0xf0)>> 4);
        byte low = (byte) (bytes [iter] & 0x0f);
        sb.append (nibble2char (high));
        sb.append (nibble2char (low));
    }
    return sb.toString ();
}


public static String toHexString2 (byte bytes []) {
    if (bytes == null) {
        return null;
    }
    StringBuffer sb = new StringBuffer ();
    for (int iter = 0;
    iter < bytes.length; iter++) {
        byte firstHalf = (byte) ((bytes [iter] & 0xaa)>> 4);
        byte secondHalf = (byte) (bytes [iter] & 0x55);
        sb.append (nibble2char (firstHalf));
        sb.append (nibble2char (secondHalf));
    }
    return sb.toString ();
}
