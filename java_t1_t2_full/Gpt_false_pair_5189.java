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
    int prev = 0;
    int index;
    while ((index = input.indexOf (oldStr, prev)) >= 0) {
        sb.append (input.substring (prev, index)).append (newStr);
        prev = index + oldStr.length ();
    }
    sb.append (input.substring (prev));
    return sb.toString ();
}
