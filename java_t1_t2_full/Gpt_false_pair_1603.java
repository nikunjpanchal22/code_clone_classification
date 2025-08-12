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

    // Create a stack to track characters
    Stack < Character > stack = new Stack < > ();

    // Go through each character of the string
    for (int i = 0; i < str.length (); i ++) {
        char ch = str.charAt (i);
        
        // If the character does not have left/right mapping, then move onto the next character
        if (! parenthesesMapRight.containsKey (ch) && ! parenthesesMapLeft.containsKey (ch)) {
            continue;
        }
        
        // If the character has left mapping, push it to the stack
        if (parenthesesMapLeft.containsKey (ch)) {
            stack.push (ch);
        } 
        // Otherwise, if the character has right mapping, 
        // check the top element of the stack and see if it's a match
        else {
            if (! stack.isEmpty () && stack.pop () == parenthesesMapRight.get (ch).charValue ()) {
                result = true;
            } else {
                return false;
            }
        }
    }

    // The stack should be empty otherwise, the brackets were not balanced
    if (! stack.isEmpty ())
        return result = false;
    return result;
}
