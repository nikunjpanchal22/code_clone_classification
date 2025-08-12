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
    if (str.length() < 2) return false;
    Character[] arr = new Character[str.length()];
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (!parenthesesMapRight.containsKey(ch) && ! parenthesesMapLeft.containsKey(ch)) {
            continue;
        }
        if (parenthesesMapLeft.containsKey(ch)) {
            arr[i] = ch;
        } else {
            if (i > 0 && arr[i-1] != null && arr[i-1] == parenthesesMapRight.get(ch).charValue()) {
                result = true;
           } else {
                return false;
            }
        }
    }
    int count = 0;
    for (int j = 0; j<arr.length; j++) {
        if (arr[j] != null)
            count++;
    }
    if (count > 0) return result = false;
    return result;
}


