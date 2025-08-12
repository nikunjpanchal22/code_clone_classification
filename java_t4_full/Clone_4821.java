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
    ArrayDeque<Character> deque = new ArrayDeque<>();
    for (char c : str.toCharArray()) {
        if (c == '[' || c == '{' || c == '(')
            deque.push(c);
        else {
            if (deque.isEmpty() || Math.abs(deque.pop() - c) > 2)
                return false;
        }
    }
    return deque.isEmpty();
}


