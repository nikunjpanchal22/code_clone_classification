public boolean isBalanced (String strExpression) {
    Map < Character, Character > bracketPair = new HashMap < Character, Character > ();
    bracketPair.put ('(', ')');
    bracketPair.put ('[', ']');
    bracketPair.put ('{', '}');
    Stack < Character > stk = new Stack < Character > ();
    for (int i = 0;
    i < strExpression.length (); i ++) {
        if (bracketPair.containsKey (strExpression.charAt (i))) stk.push (strExpression.charAt (i));
        else if (bracketPair.containsValue (strExpression.charAt (i))) if (stk.isEmpty () || bracketPair.get (stk.pop ()) != strExpression.charAt (i)) return false;
    }
    if (stk.isEmpty ()) return true;
    else return false;
}




public boolean isBalanced(String strExpression) {
    Deque<Character> stack = new ArrayDeque<Character>();
    for (int i = 0; i < strExpression.length(); i++) {
        char s = strExpression.charAt(i);
        if (s == '(' || s == '[' || s == '{') {
            stack.push(s);
        } else if (s == ')' || s == ']' || s == '}') {
            if (stack.isEmpty()) {
                return false;
            } else if (s == ')' && stack.pop() != '(' ||
                s == ']' && stack.pop() != '[' ||
                s == '}' && stack.pop() != '{') {
                return false;
            }
        }
    }
    return stack.isEmpty();
}


