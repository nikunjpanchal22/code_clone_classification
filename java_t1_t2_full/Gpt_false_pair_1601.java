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

    // Initialize a Stack of characters
    Stack < Character > stack = new Stack < > ();

    for (int i = 0; i < str.length (); i ++) {
        // Get the character from the string
        char ch = str.charAt (i);
        
        // If the character does not have a left/right mapping, skip it
        if (! parenthesesMapRight.containsKey (ch) && ! parenthesesMapLeft.containsKey (ch)) {
            continue;
        }
        
        // If the character has a left mapping, add it to the stack
        if (parenthesesMapLeft.containsKey (ch)) {
            stack.push (ch);
        } 
        // Otherwise, if the character has a right mapping, 
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
