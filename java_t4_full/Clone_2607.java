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
    int i = input.indexOf(oldStr);
    if (i < 0) return input;
    StringBuilder sb = new StringBuilder();
    int last = 0;
    while (i >= 0) {
        sb.append(input, last, i).append(newStr);
        last = i + oldStr.length(); i = input.indexOf(oldStr, last);
    }
    return sb.append(input, last, input.length()).toString();
}


