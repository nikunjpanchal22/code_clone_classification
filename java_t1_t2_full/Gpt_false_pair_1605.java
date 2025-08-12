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


 public static boolean isBalanced (String str) {
    boolean result = false;

    // Return false for strings with length less than 2
    if (str.length () < 2)
        return false;

    // Use a stack to keep track of the characters
    Stack <Character> stack = new Stack <Character> ();
    for (int i = 0; i < str.length (); i ++) {
        char ch = str.charAt (i);
        // Ignore it if the character does not have a left/right mapping
        if (! parenthesesMapRight.containsKey (ch) && ! parenthesesMapLeft.containsKey (ch)) {
            continue;
        }

        // Add the character to the stack if it has a left mapping
        if (parenthesesMapLeft.containsKey (ch)) {
            stack.push (ch);
        } else {
            // If it has a right mapping, check the top of the stack
            if (! stack.isEmpty () && stack.pop () == parenthesesMapRight.get (ch).charValue ()) {
                result = true;
            } else {
                return false;
            }
        }
    }

    // If the stack is not empty, the brackets were not balanced
    if (! stack.isEmpty ())
        return result = false;
    return result;
}
