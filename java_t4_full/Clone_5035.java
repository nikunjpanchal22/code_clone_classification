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
    char[] bracketArray = str.toCharArray();
    Stack<Character> s = new Stack<>();
    char ch;
    for (int i = 0; i < bracketArray.length; i++) {
        if(parenthesesMapLeft.containsKey(bracketArray[i]) || parenthesesMapRight.containsKey(bracketArray[i])) {
            if (parenthesesMapLeft.containsKey(bracketArray[i])) {
                s.push(bracketArray[i]);
                continue;
            } else {
                if (s.isEmpty())
                    return false;
                else if ( !s.pop().equals(parenthesesMapRight.get(bracketArray[i])))
                    return false;
            }
        }
    } 
    if (s.isEmpty())
        return true; 
    else 
        return false;
}


