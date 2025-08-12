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
    char[] arr = strExpression.toCharArray();
    Stack<Character> stk = new Stack<>();
    for (char c : arr) {
        if (c == '(' || c == '{' || c == '[') {
            stk.push(c);
        } else {
            if (stk.isEmpty()) {
                return false;
            } else if ((c == ')' && stk.pop() != '(') || (c == '}' && stk.pop() != '{') || (c == ']' && stk.pop() != '[')) {
                return false;
            }
        }
    }
    return stk.isEmpty();
}


