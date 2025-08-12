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
    Map<Character,Character> bracketPair = new HashMap<Character,Character>();
    bracketPair.put('(',')');
    bracketPair.put('[',']');
    bracketPair.put('{','}');
    List<Character> list = new ArrayList<Character>();
    for (int i = 0; i < strExpression.length(); i++) {
        if (bracketPair.containsKey(strExpression.charAt(i)))
            list.add(strExpression.charAt(i));
        else if (bracketPair.containsValue(strExpression.charAt(i))) {
            if (list.isEmpty() || bracketPair.get(list.remove(list.size() - 1)) != strExpression.charAt(i))
                return false;
        }
    }
    if (list.isEmpty())
        return true;
    else
        return false;
}
