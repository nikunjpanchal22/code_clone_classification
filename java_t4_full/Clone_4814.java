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
    Stack<Character> stack = new Stack<>();
    for(char ch:s.toCharArray()){
        switch(ch) {
            case '{': stack.push('}'); break;
            case '[': stack.push(']'); break;
            case '(': stack.push(')'); break;
            default :
                if(stack.empty() || ch != stack.peek()){
                    return false;
                }
                stack.pop();
        }
    }
    return stack.empty();
}


