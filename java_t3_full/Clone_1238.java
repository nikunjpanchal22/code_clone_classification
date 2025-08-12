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

    // Return false if the string is shorter than 2
    if (str.length () < 2)
        return false;

    // Create a stack to track characters
    Stack <Character> stack = new Stack <Character> ();
    for (int i = 0; i < str.length (); i++) {
        char ch = str.charAt(i);

        // If the character does not have a left/right mapping, ignore it.
        if (! parenthesesMapRight.containsKey(ch) && ! parenthesesMapLeft.containsKey(ch)) {
            continue;
        }

        // If the character has a left mapping push it to the stack.
        if (parenthesesMapLeft.containsKey(ch)) {
            stack.push(ch);
        } 
        // Otherwise, if the character has a right mapping, 
        // check the top of the stack for a match.
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


