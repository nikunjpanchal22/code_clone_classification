public static String toHexString (byte [] bytes) {
    StringBuilder hexString = new StringBuilder ();
    for (int i = 0;
    i < bytes.length; i ++) {
        String hex = Integer.toHexString (0xFF & bytes [i]);
        if (hex.length () == 1) {
            hexString.append ('0');
        }
        hexString.append (hex);
    }
    return hexString.toString ();
}


public static String toHexString (byte [] data) {
    StringBuilder retStr = new StringBuilder();
    for (int i = 0; i < data.length; i++) {
        String hexStr = Integer.toHexString(0xFF & data[i]);
        if (hexStr.length() == 1) {
            retStr.append('0');
        }
        retStr.append(hexStr);
    }
    return retStr.toString(); 
}
