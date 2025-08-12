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


 public static boolean isBalanced (String brackets) { 
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')'); 
        map.put('[', ']'); 
        map.put('{', '}'); 
        if (brackets.length() % 2 != 0) 
            return false; 
        Stack<Character> stack = new Stack<Character>(); 
        for (int i = 0; i < brackets.length(); i++) { 
            char curr = brackets.charAt(i); 
            if (map.containsKey(curr)) { 
                stack.push(map.get(curr));
            }  
            else if (!stack.isEmpty() && 
                     stack.peek() == curr) { 
                stack.pop(); 
            }
            else {
                return false; 
            }
        } 
        return stack.isEmpty(); 
    } 

 public static boolean isBalanced(String brackets) {
    if (brackets.length() % 2 != 0) {
        return false;
    }
    Map<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put('[', ']');
    map.put('{', '}');
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < brackets.length(); i++) {
        char curr = brackets.charAt(i);
        if (map.containsKey(curr)) {
            stack.push(map.get(curr));
        } else if (stack.empty() || stack.peek() != curr) {
            return false;
        } else {
            stack.pop();
        }
    }
    return stack.empty();
}


