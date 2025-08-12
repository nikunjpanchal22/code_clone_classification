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





public static boolean isBalanced(String str) {
    if (str == null || str.isEmpty())
        return true;
    Stack<Character> s = new Stack<>();
    for (char bracket : str.toCharArray()) {
        if (parenthesesMapLeft.containsKey(bracket)) {
            s.push(bracket);
        } else if (parenthesesMapRight.containsKey(bracket)) {
            if (s.isEmpty() || !s.peek().equals(parenthesesMapRight.get(bracket))) {
                return false;
            }
            s.pop();
        }
    }
    return s.isEmpty();
}


