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
    Map<Character, Character> balancedChars = new HashMap<>();
    balancedChars.put('(', ')');
    balancedChars.put('[', ']');
    balancedChars.put('{', '}');
    Stack<Character> openBrackets = new Stack<>();

    for (int i = 0; i < expression.length(); i++) {
        Character character = expression.charAt(i);
        if (balancedChars.containsKey(character)) openBrackets.push(character);
        else if (balancedChars.containsValue(character)) 
			if (openBrackets.isEmpty() || balancedChars.get(openBrackets.pop()) != character) 
				return false;
    }
    return openBrackets.isEmpty();
}


