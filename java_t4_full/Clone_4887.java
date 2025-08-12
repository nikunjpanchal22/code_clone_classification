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





public static boolean isBalanced8(String s) {
    char[] arr = new char[s.length()];
    int i=0;
    for (char c : s.toCharArray()) {
        if(i==0 || c=='(' || c=='[' || c=='{')
            arr[i++] = c;
        else if (c == ')' && arr[i-1] == '(')
            i--;
        else if (c == ']' && arr[i-1] == '[')
            i--;
        else if (c == '}' && arr[i-1] == '{')
            i--;
        else
            return false;
    }
    return i == 0;
}


