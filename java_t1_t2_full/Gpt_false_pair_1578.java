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


  public static boolean isBalanced (String brackets) {
    Map<Character, Character> map = new HashMap<>();
    map.put ('(', ')');
    map.put ('[', ']');
    map.put ('{', '}');
    if (brackets.length() % 2 != 0) {
        return false;
    }
    Stack<Character> halfBraces = new Stack<Character>();
    for (char ch : brackets.toCharArray()) {
        if (map.containsKey(ch)) {
            halfBraces.push (map.get(ch));
        }
        else if(halfBraces.empty() || ch != halfBraces.peek()) {
            return false;
        }
        else {
            halfBraces.pop();
        }
    }
    return halfBraces.empty();
}
