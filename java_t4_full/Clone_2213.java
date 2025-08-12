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


 public static String toHexString(byte[] bytes) {
    if (bytes == null) {
        return null;
    }
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < bytes.length; i++) {
        sb.append(Integer.toHexString(((int) bytes[i] & 0xff) | 0x100).substring(1, 3));
    }
    return sb.toString();
}


