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
    char[] c = str.toCharArray();
    Stack<Character> s = new Stack<>();
    for (int i = 0; i < c.length; i++) {
        if(parenthesesMapLeft.containsKey(c[i])){
            s.add(c[i]);
        } 
        else if(parenthesesMapRight.containsKey(c[i])){
            if(s.isEmpty()) {
                return false; 
            }
            if(c[i] != parenthesesMapRight.get(s.peek())){
                return false;
            }
            s.pop();
        }}
    return s.isEmpty();
}


