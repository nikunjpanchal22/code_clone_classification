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


public boolean isBalanced (String strExpression) {
    Map<Character,Character> bracketPair = new HashMap<Character,Character>();
    bracketPair.put('(',')');
    bracketPair.put('[',']');
    bracketPair.put('{','}');
    Deque<Character> deque = new ArrayDeque<Character>();
    for (int i = 0; i < strExpression.length(); i++) {
        if (bracketPair.containsKey(strExpression.charAt(i)))
            deque.addLast(strExpression.charAt(i));
        else if (bracketPair.containsValue(strExpression.charAt(i))) {
            if (deque.isEmpty() || bracketPair.get(deque.removeLast()) != strExpression.charAt(i))
                return false;
        }
    }
    if (deque.isEmpty())
        return true;
    else
        return false;
}
