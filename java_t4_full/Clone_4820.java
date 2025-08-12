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






public static boolean isBalanced(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for(char ch: s.toCharArray()){
        if(ch == '(')
            stack.push(')');
        else if(ch == '[')
            stack.push(']');
        else if(ch == '{')
            stack.push('}');
        else if(stack.isEmpty() || ch != stack.pop())
            return false;
    }
    return stack.isEmpty();
}


