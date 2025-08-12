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

    // Return false if the length of the string is less than 2
    if (str.length () < 2) 
    return false;

    // Use a stack to keep track of the characters
    Stack <Character> stack = new Stack <Character> ();

    // Go through each character of the string
    for (int i = 0; i < str.length (); i ++) {
        char ch = str.charAt (i);

        // Ignore it if the character does not have left/right mapping
        if (! parenthesesMapRight.containsKey (ch) && ! parenthesesMapLeft.containsKey (ch)) {
            continue;
        }
        // Push to the stack if the character has a left mapping
        if (parenthesesMapLeft.containsKey (ch)) {
            stack.push (ch);
        } else {
            // Check the top of the stack if the character has a right mapping
            if (! stack.isEmpty () && stack.pop () == parenthesesMapRight.get (ch).charValue ()) {
                result = true;
            } else {
                return false;
            }
        }
    }

    // The stack should be empty, otherwise the brackets were not balanced
    if (! stack.isEmpty ())
        return result = false;
    return result;
}
