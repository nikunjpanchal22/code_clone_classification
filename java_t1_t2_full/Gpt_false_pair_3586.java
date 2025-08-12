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


public static String toHexString (byte [] bytes) {
    if (bytes == null) {
        return null;
    }
    StringBuffer sb = new StringBuffer ();
    for (int i = 0;
    i < bytes.length; i++) { 
        byte high = (byte) ((bytes[i] >> 4) & 0xf); 
        byte low = (byte) (bytes[i] & 0xf); 
        sb.append (nibble2char (high));
        sb.append (nibble2char (low));
    }
    return sb.toString (); 
}
