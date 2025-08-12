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
    Stack<Character> stk = new Stack<Character>();
    HashMap<Character, Character> dict = new HashMap<Character, Character>();
    dict.put(')', '(');
    dict.put(']', '[');
    dict.put('}', '{');

    for (Character c : strExpression.toCharArray()) {
        if (dict.containsKey(c) && !stk.isEmpty() && dict.get(c) == stk.peek()) {
            stk.pop();
        } else {
            stk.push(c);
        }
    }
    return stk.isEmpty();
}


