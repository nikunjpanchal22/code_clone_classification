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



public static String toHexString(byte[] bytes) {
    String hexDigits = "0123456789abcdef";
    StringBuilder sb = new StringBuilder(bytes.length * 2);
    for (byte b : bytes) {
        sb.append(hexDigits.charAt((b & 0xF0) >> 4));
        sb.append(hexDigits.charAt(b & 0x0F));
    }
    return sb.toString();
}


