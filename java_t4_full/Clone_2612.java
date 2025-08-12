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





public static String replace(String oldStr, String newStr, String input) {
    int i;
    while ((i = input.indexOf(oldStr)) != -1) {
        input = input.substring(0, i) + newStr + input.substring(i + oldStr.length());
    }
    return input;
}


