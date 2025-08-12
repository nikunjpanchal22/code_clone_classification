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
    if (str.isEmpty())
        return true;

    Deque<Character> stack = new LinkedList<>();

    for (int i = 0; i < str.length(); i++) {
        char current = str.charAt(i);
        if(parenthesesMapLeft.containsKey(current)){
            stack.push(current);
        } else if(parenthesesMapRight.containsKey(current)){
            if (stack.isEmpty() || stack.pop() != parenthesesMapRight.get(current))
                return false;
        }
    }

    return stack.isEmpty();
}


