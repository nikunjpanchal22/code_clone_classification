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

    Map<Character, Character> bracketsPair = new HashMap<>();
    bracketsPair.put('(', ')');
    bracketsPair.put('[', ']');
    bracketsPair.put('{', '}');

    Stack<Character> openingBrackets = new Stack<>();

    for (int i = 0; i < expression.length(); i++) {
        if (bracketsPair.containsKey(expression.charAt(i)))
            openingBrackets.push(expression.charAt(i));
        if (bracketsPair.containsValue(expression.charAt(i))) 
			if (openingBrackets.isEmpty() || bracketsPair.get(openingBrackets.pop()) != expression.charAt(i))
                return false;
    }

    if (openingBrackets.isEmpty()) return true;
    else return false;
}


