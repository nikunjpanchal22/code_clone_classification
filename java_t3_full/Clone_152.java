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
    StringBuilder output = new StringBuilder();
    int prev = 0;
    int current = 0;

    while ((current = input.indexOf(oldStr, prev)) >= 0) {
        output.append(input, prev, current);
        output.append(newStr);
        prev = current + oldStr.length();
    }
    output.append(input.substring(prev));

    return output.toString();
}


