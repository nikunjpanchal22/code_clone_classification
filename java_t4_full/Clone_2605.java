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
    Stack<Character> stack = new Stack<>();
    for (char c : input.toCharArray()) stack.push(c);
    StringBuilder sb = new StringBuilder(input.length() + newStr.length() - oldStr.length());
    for (int j = 0; j < i; j++) sb.append(stack.pop());
    sb.append(newStr);
    for (int j = 0; j < oldStr.length(); j++) stack.pop();
    while (!stack.isEmpty()) sb.append(stack.pop());
    return sb.toString();
}


