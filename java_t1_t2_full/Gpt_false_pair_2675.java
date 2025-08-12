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
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < bytes.length; i++){
            int num = bytes[i] & 0xFF;
            String hex = Integer.toHexString(num);
            if (hex.length() == 1){
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
}
