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
    Deque<Character> stk = new LinkedList<>();
    Map<Character, Character> map = Map.of(')','(','}', '{', ']', '[');
    for(char x: s.toCharArray()){
        if(map.containsKey(x)){
            if(stk.isEmpty() || stk.pop()!=map.get(x))
                return false;
        }
        else stk.push(x);
    }
    return stk.isEmpty();
}


