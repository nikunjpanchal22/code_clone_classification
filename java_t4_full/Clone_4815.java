public static boolean isBalanced (String brackets) {
    Map < Character, Character > braces = new HashMap < > ();
    braces.put ('(', ')');
    braces.put ('[', ']');
    braces.put ('{', '}');
    if (brackets.length () % 2 != 0) {
        return false;
    }
    Stack < Character > halfBraces = new Stack ();
    for (char ch : brackets.toCharArray ()) {
        if (braces.containsKey (ch)) {
            halfBraces.push (braces.get (ch));
        } else if (halfBraces.isEmpty () || ch != halfBraces.pop ()) {
            return false;
        }
    }
    return halfBraces.isEmpty ();
}






public static boolean isBalanced(String str) {
    LinkedList<Character> stack = new LinkedList<>();
    for(char c : str.toCharArray()) {
        if(c == '(' || c == '{' || c == '[' ) {
            stack.push(c);
        } else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
        } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
            stack.pop();
        } else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
            stack.pop();
        } else {
            return false;
        }
    }
    return stack.isEmpty();
}


