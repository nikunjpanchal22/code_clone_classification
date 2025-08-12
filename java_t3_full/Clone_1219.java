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


 public boolean isBalanced(String str) {
    Map<Character, Character> balanceMap = new HashMap<>();
    balanceMap.put('(', ')');
    balanceMap.put('[', ']');
    balanceMap.put('{', '}');
    Stack<Character> brackets = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
        if (balanceMap.containsKey(str.charAt(i)))
            brackets.push(str.charAt(i));
        else if (balanceMap.containsValue(str.charAt(i)))
            if (brackets.empty() || balanceMap.get(brackets.pop()) != str.charAt(i)) return false;
    }

    if (brackets.empty()) return true;
    return false;
}


