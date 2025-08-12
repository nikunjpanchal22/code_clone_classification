public static boolean isBalanced (String str) {
    boolean result = false;
    if (str.length () < 2) return false;
    Stack < Character > stack = new Stack < > ();
    for (int i = 0;
    i < str.length (); i ++) {
        char ch = str.charAt (i);
        if (! parenthesesMapRight.containsKey (ch) && ! parenthesesMapLeft.containsKey (ch)) {
            continue;
        }
        if (parenthesesMapLeft.containsKey (ch)) {
            stack.push (ch);
        } else {
            if (! stack.isEmpty () && stack.pop () == parenthesesMapRight.get (ch).charValue ()) {
                result = true;
            } else {
                return false;
            }
        }
    }
    if (! stack.isEmpty ()) return result = false;
    return result;
}





public static boolean isBalanced3(String s) {
    LinkedList<Character> stack = new LinkedList<>();
    char[] sc = s.toCharArray();
    for(int i =0; i< sc.length;i++){
        if(sc[i] == '(') stack.push(')');
        else if(sc[i]=='{') stack.push('}');
        else if(sc[i] == '[') stack.push(']');
        else if(stack.isEmpty() || stack.pop()!=sc[i])
            return false;           
    }
    return stack.isEmpty();
}


