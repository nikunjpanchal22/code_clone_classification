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


 public boolean isBalanced(String expression) {
    Map<Character, Character> BalancesMap = new HashMap<Character, Character>();
    BalancesMap.put('(', ')');
    BalancesMap.put('[', ']');
    BalancesMap.put('{', '}');
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < expression.length(); i++) {
        if (BalancesMap.containsKey(expression.charAt(i)))
            stack.push(expression.charAt(i));
        else if (BalancesMap.containsValue(expression.charAt(i))) 
			if (stack.isEmpty() || BalancesMap.get(stack.pop()) != expression.charAt(i))
                return false;
    }
    if (stack.isEmpty()) return true;
    else return false;
} 
