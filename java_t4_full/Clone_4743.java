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
    Stack<Character> stk = new Stack<>();
    HashMap<Character, Character> mappings = new HashMap<>();
    mappings.put(')', '(');
    mappings.put(']', '[');
    mappings.put('}', '{');
    for (int i = 0; i < strExpression.length(); i++) {
        char c = strExpression.charAt(i);
        if (mappings.containsKey(c)) {
            char topElement = stk.empty() ? '#' : stk.pop();
            if (topElement != mappings.get(c)) 
                return false;
        } else {
            stk.push(c);
        }
    }
    return stk.empty();
}


