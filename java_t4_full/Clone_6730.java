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




public static String toHexString (byte [] bytes) {
    StringBuilder hexString = new StringBuilder ();
    for (byte b: bytes) {
        hexString.append (Character.forDigit((b >> 4) & 0xF, 16));
        hexString.append (Character.forDigit((b & 0xF), 16));
    }
    return hexString.toString ();
}


