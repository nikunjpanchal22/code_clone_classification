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
    if (str == null || str.isEmpty()) {
        return true;
    }
    LinkedList<Character> stack = new LinkedList<>();
    for (char currentChar : str.toCharArray()) {
        if (parenthesesMapRight.containsKey(currentChar) || parenthesesMapLeft.containsKey(currentChar)) {
            if (parenthesesMapLeft.containsKey(currentChar)) {
                stack.addFirst(currentChar);
            } else if (stack.size() == 0 || !stack.removeFirst().equals(parenthesesMapRight.get(currentChar))) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}


