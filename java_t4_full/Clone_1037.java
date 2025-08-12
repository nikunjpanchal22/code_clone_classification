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


  public static boolean isBalanced(String brackets) {
    if (brackets.length() % 2 != 0){
        return false;
    }
    HashMap<Character, Character> hm = new HashMap<>();
    hm.put('{', '}');
    hm.put('(', ')');
    hm.put('[', ']');
    Deque<Character> stack = new ArrayDeque<>();
    for (int i = 0; i < brackets.length(); i++) {
        char ch = brackets.charAt(i);
        if (hm.containsKey(ch)){
            stack.push(hm.get(ch));
        }
        else if (stack.isEmpty() || stack.peek() != ch){
            return false;
        }
        else {
            stack.pop();
        }
    }
    return (stack.isEmpty());
}


