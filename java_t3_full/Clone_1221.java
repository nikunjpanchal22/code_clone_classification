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
    Map<Character, Character> bracketMapping = new HashMap<Character, Character>();
    bracketMapping.put('(', ')');
    bracketMapping.put('[', ']');
    bracketMapping.put('{', '}');

    Stack<Character> openBrackets = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
        Character character = str.charAt(i);
        if (bracketMapping.containsKey(character))
            openBrackets.push(str.charAt(i));
        else if (bracketMapping.containsValue(character)) 
			if (openBrackets.isEmpty() || bracketMapping.get(openBrackets.pop()) != character) 
				return false;
    }
    return openBrackets.isEmpty();
}


