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
    int currIndex = 0;
    int startIndex = 0;

    while (currIndex >= 0) {
        currIndex = input.indexOf(oldStr, startIndex);
        if (currIndex > 0) {
            sb.append(input.substring(startIndex, currIndex)).append(newStr);
            startIndex = currIndex + oldStr.length();
        }
        else {
            sb.append(input.substring(startIndex));
        }
    }

    return sb.toString();
}


