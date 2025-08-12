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


 public static boolean isBalanced(String brackets) { 
        Stack<Character> stack  = new Stack<>(); 
        int lenString = brackets.length(); 
        if (lenString % 2 != 0){
         return false; 
        }
        else { 
            for (int i = 0; i < lenString; i++){ 
                char ch = brackets.charAt(i); 
                if (ch == '{') 
                    stack.push('}'); 
                else if (ch == '[') 
                    stack.push(']'); 
                else if (ch == '(') 
                    stack.push(')'); 
                else if (stack.isEmpty() || stack.peek() != ch) 
                    return false; 
                else
                    stack.pop(); 
            }
            return stack.isEmpty(); 
        } 
    } 

  public static boolean isBalanced(String brackets) {
    if (brackets.length() % 2 != 0) {
        return false;
    }
    Map<Character, Character> map = new HashMap<>();
    map.put('(', ')'); 
    map.put('[', ']'); 
    map.put('{', '}'); 
    Deque<Character> stack = new ArrayDeque<Character>();
    for (int i = 0; i < brackets.length(); i++) {
        char curr = brackets.charAt(i);
        if (map.containsKey(curr)) {
            stack.addLast(map.get(curr));
        } else if(!stack.isEmpty() && stack.getLast() == curr) {
            stack.removeLast();
        } else {
            return false;
        }
    }
    return stack.isEmpty();
}


