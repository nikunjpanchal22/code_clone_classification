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


 public boolean isBalanced(String syntax) {
    Map<Character, Character> balanceMap = new HashMap<Character, Character>();
    balanceMap.put('(', ')');
    balanceMap.put('[', ']');
    balanceMap.put('{', '}');
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < syntax.length(); i++) {
        if (balanceMap.containsKey(syntax.charAt(i)))
            stack.push(syntax.charAt(i));
        else if (balanceMap.containsValue(syntax.charAt(i)))
            if (stack.empty() || balanceMap.get(stack.pop()) != syntax.charAt(i))
                return false;
    }
    if (stack.isEmpty()) return true;
    else return false;
}
