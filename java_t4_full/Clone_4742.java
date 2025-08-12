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
    char[] stack = new char[strExpression.length()];
    int head = 0;
    for (char c : strExpression.toCharArray()) {
        switch(c) {
            case '{':
            case '(':
            case '[':
                stack[head++] = c;
                break;
            case '}':
                if (head == 0 || stack[--head] != '{') 
                    return false;
                break;
            case ')':
                if (head == 0 || stack[--head] != '(') 
                    return false;
                break;
            case ']':
                if (head == 0 || stack[--head] != '[') 
                    return false;
                break;
            default:
                return false;
        }
    }
    return head == 0;
}


