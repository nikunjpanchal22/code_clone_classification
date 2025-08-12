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
    StringBuilder outputStr = new StringBuilder();
    int startIndex = 0;
    int endIndex = input.indexOf(oldStr);
    while(endIndex >= 0) {
        outputStr.append(input, startIndex, endIndex).append(newStr);  
        startIndex = endIndex + oldStr.length();
        endIndex = input.indexOf(oldStr, startIndex);
    }
    outputStr.append(input, startIndex, input.length());
    return outputStr.toString();
}


