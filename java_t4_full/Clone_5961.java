public static String removeAdjacentDuplicates (String input) {
    if (input.length () <= 1) {
        return input;
    }
    StringBuilder sb = new StringBuilder ();
    sb.append (input.charAt (0));
    IntStream.range (1, input.length ()).mapToObj (i -> input.charAt (i) != input.charAt (i - 1) ? input.charAt (i) : "").forEach (sb :: append);
    return sb.toString ();
}



 

public static String removeAdjacentDuplicates(String input){
    Stack<Character> stack = new Stack<>();

    stack.push(input.charAt(0));
    
    for(int i = 1; i < input.length(); i++){
        if(stack.empty() || stack.peek()!=input.charAt(i))
            stack.push(input.charAt(i));
    }
    StringBuilder sb = new StringBuilder();
    while(!stack.empty()){
        sb.append(stack.pop());
    }
    return sb.reverse().toString();
}


