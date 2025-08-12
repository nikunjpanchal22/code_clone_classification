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
    char[] hexArray = "0123456789ABCDEF".toCharArray();
    char[] hexChars = new char[bytes.length * 2];
    for (int j = 0; j < bytes.length; j++) {
        int v = bytes[j] & 0xFF;
        hexChars[j * 2] = hexArray[v >>> 4];
        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
    }
    return new String(hexChars);
}


