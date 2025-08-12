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


 public boolean isBalanced(String string) {
    Map<Character, Character> mapping = new HashMap<>();
    mapping.put('(', ')');
    mapping.put('[', ']');
    mapping.put('{', '}');
    Stack<Character> openBrackets = new Stack<>();

    for (int i = 0; i < string.length(); i++) {
        Character character = string.charAt(i);
        if (mapping.containsKey(character)) openBrackets.push(character);
        else if (mapping.containsValue(character)) 
			if (openBrackets.isEmpty() || mapping.get(openBrackets.pop()) != character) 
				return false;
    }
    return openBrackets.isEmpty();
}


