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
    char[] inputChars = input.toCharArray();
    StringBuilder sb = new StringBuilder(input.length() + newStr.length() - oldStr.length());
    sb.append(inputChars, 0, i).append(newStr)
      .append(inputChars, i + oldStr.length(), inputChars.length - i - oldStr.length());
    return sb.toString();
}


