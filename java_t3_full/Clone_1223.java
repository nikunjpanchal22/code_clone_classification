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
    HashMap<Character, Character> bracketPairs = new HashMap<>();
    bracketPairs.put('(', ')');
    bracketPairs.put('[', ']');
    bracketPairs.put('{', '}');
    Stack<Character> brackets = new Stack<>();

    for (int i = 0; i < strExpression.length(); i++) {
        if (bracketPairs.containsKey(strExpression.charAt(i)))
            brackets.push(strExpression.charAt(i));
        else if (bracketPairs.containsValue(strExpression.charAt(i)))
            if (brackets.isEmpty() || bracketPairs.get(brackets.pop()) != strExpression.charAt(i))
                return false;
    }

    return brackets.isEmpty();
}


