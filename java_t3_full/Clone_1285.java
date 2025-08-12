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


 public static boolean isBalanced (String str) {boolean result = true;
    if (str.length () < 2) return false;
    Stack < Character > stck = new Stack < > ();
    for (int i = 0; i < str.length (); i++) {
        char ch = str.charAt(i);
        if (parenthesesMapLeft.containsKey(ch)) {
            stck.push(str.charAt(i));
        } else if (parenthesesMapRight.containsKey(ch)) {
            if (stck.isEmpty() || parenthesesMapLeft.get(stck.pop()) != str.charAt(i)) {
                return false;
            } else {
                result = true;
            }
        }
    }
    if (! stck.isEmpty()) return false; 
    return result;
}


