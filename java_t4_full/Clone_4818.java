public static boolean isBalanced (String brackets) {
    Map < Character, Character > braces = new HashMap < > ();
    braces.put ('(', ')');
    braces.put ('[', ']');
    braces.put ('{', '}');
    if (brackets.length () % 2 != 0) {
        return false;
    }
    Stack < Character > halfBraces = new Stack ();
    for (char ch : brackets.toCharArray ()) {
        if (braces.containsKey (ch)) {
            halfBraces.push (braces.get (ch));
        } else if (halfBraces.isEmpty () || ch != halfBraces.pop ()) {
            return false;
        }
    }
    return halfBraces.isEmpty ();
}






public static boolean isBalanced(String s) {
    if(s.length()%2 != 0)
        return false;

    char[] chars = new char[s.length()];
    int i=0;
    for(char ch : s.toCharArray()){
        if(ch=='{' || ch=='[' || ch=='('){
            chars[i++] = ch;
        }
        if(ch=='}' || ch==']' || ch==')'){
            if(i==0 || Math.abs(ch-chars[--i])>2 ){
                return false;
            }
        }
    }
    return i==0;
}


