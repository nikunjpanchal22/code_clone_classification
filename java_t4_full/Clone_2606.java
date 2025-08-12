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
    StringTokenizer tokenizer = new StringTokenizer(input, oldStr, true);
    StringBuffer buffer = new StringBuffer();
    while (tokenizer.hasMoreTokens()) {
        String token = tokenizer.nextToken();
        if (token.equals(oldStr)) {
            buffer.append(newStr);
        } else {
            buffer.append(token);
        }
    }
    return buffer.toString();
}


