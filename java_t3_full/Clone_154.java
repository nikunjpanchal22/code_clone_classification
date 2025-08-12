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
    StringBuilder sb = new StringBuilder();
    int startIndex = 0;
    int matchIndex = 0;
    
    while ((matchIndex = input.indexOf(oldStr, startIndex)) > 0) {
        sb.append(input, startIndex, matchIndex).append(newStr);
        startIndex = matchIndex + oldStr.length();
    }
    sb.append(input.substring(startIndex));
    return sb.toString();
}


