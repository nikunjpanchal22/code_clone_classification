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
    boolean result = false;
    if (str.length() < 2) 
        return false;

    Stack <Character> stack = new Stack <Character> ();
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        // If the character does not have a left/right mapping, ignore it and move onto the next character.
        if (! parenthesesMapRight.containsKey(ch) && ! parenthesesMapLeft.containsKey(ch)) {
            continue;
        }
        // If the character has a left mapping, add it to the stack
        if (parenthesesMapLeft.containsKey (ch)) {
            stack.push(ch);
        } 
        // Otherwise, if the character has a right mapping, 
        // check the top element of the stack and see if it's a match
        else {
            if (!stack.isEmpty() && stack.pop() == parenthesesMapRight.get(ch).charValue())
                result = true;
            else 
                return false;
        }
    }
    // If the stack is not empty, then the brackets were not balanced
    if (!stack.isEmpty())
        return result = false;
    // Otherwise, the brackets were balanced
    return result;
}


