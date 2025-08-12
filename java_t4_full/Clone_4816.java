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






public static boolean isBalanced(String s){
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length(); i ++) {
        char c = s.charAt(i);
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else {
            if (stack.size() == 0)
                return false;
            char p = stack.pop();
            if (c == ')' && p != '(' || c == ']' && p != '[' || c == '}' && p != '{')
                return false;
        }
    }
    return stack.size() == 0;
}


