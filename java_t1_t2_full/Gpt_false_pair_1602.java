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

    // Return false for strings with length less than 2
    if (str.length () < 2)
        return false;

    // Create a stack to track characters
    Stack <Character> stack = new Stack <Character> ();
    for (int i = 0; i < str.length (); i ++) {
        char ch = str.charAt (i);
        
        // If there is no left/right mapping for the character, skip
        if (! parenthesesMapRight.containsKey (ch) && ! parenthesesMapLeft.containsKey (ch)) {
            continue;
        }

        // If there is a left mapping for the character, push it to the stack
        if (parenthesesMapLeft.containsKey (ch)) {
            stack.push (ch);
        } else {
            // If there is a right mapping, check the top of the stack
            if (! stack.isEmpty () && stack.pop () == parenthesesMapRight.get (ch).charValue ()) {
                result = true;
            } else {
                return false;
            }
        }
    }

    // The stack should be empty otherwise the brackets were not balanced
    if (! stack.isEmpty ())
        return result = false;
    return result;
}
