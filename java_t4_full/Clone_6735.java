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
    BigInteger bi = new BigInteger(1, bytes);
    return String.format("%0" + (bytes.length << 1) + "x", bi);
}


