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
    char[] arr = s.toCharArray();
    Deque<Character> stack = new ArrayDeque<>();
    for (char ch : arr) {
        if (ch == '(' || ch == '[' || ch == '{')
            stack.push(ch);
        else {
            if (stack.isEmpty())
                return false;
            char last = stack.peek();
            if ((last == '(' && ch == ')') || (last == '[' && ch == ']') || (last == '{' && ch == '}'))
                stack.pop();
            else 
                return false;
        }
    }
    return stack.isEmpty();
}


