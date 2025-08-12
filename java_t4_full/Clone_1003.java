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
    Map<Character, Character> brackets = new HashMap<>();
    brackets.put('(', ')');
    brackets.put('[', ']');
    brackets.put('{', '}');

    Stack<Character> bracketStack = new Stack<>();

    for (int i = 0; i < string.length(); i++) {
        char curChar = string.charAt(i);
        if (brackets.containsKey(curChar)) bracketStack.push(curChar);
        else if (brackets.containsValue(curChar)) {
            if (bracketStack.empty()) return false;
            else {
                char openedBracket = bracketStack.pop();
                char closedBracket = brackets.get(openedBracket);
                if (closedBracket != curChar) return false;
            }
        }
    }
    if (bracketStack.isEmpty()) return true;
    return false;
}


