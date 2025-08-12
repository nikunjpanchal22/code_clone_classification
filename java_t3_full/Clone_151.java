public static String replace (String oldStr, String newStr, String input) {
    StringBuilder sb = new StringBuilder ();
    int i;
    int prev = 0;
    while ((i = input.indexOf (oldStr, prev)) >= 0) {
        sb.append (input.substring (prev, i)).append (newStr);
        prev = i + oldStr.length ();
    }
    sb.append (input.substring (prev));
    return sb.toString ();
}


 public static String replace (String oldStr, String newStr, String input) {
    StringBuilder sb = new StringBuilder ();
    int startIndex = 0;

    while (input.indexOf (oldStr, startIndex) > 0) {
        int oldStrIndex = input.indexOf (oldStr, startIndex);
        sb.append (input.substring (startIndex, oldStrIndex));
        sb.append (newStr);
        startIndex = oldStrIndex + oldStr.length ();
    }
    sb.append (input.substring (startIndex));
    return sb.toString();
}


