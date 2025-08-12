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


 public boolean isBalanced(String input) {
    Map<Character, Character> bracketPair = new HashMap<>();
    bracketPair.put('(', ')');
    bracketPair.put('[', ']');
    bracketPair.put('{', '}');
    Stack<Character> openBrackets = new Stack<>();

    for (int i = 0; i < input.length(); i++) {
        if (bracketPair.containsKey(input.charAt(i)))
            openBrackets.push(input.charAt(i));

        else if (bracketPair.containsValue(input.charAt(i))) 
			if (openBrackets.isEmpty() || bracketPair.get(openBrackets.pop()) != input.charAt(i))
                return false;
    }

    return openBrackets.isEmpty();
}


