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
    char[] ch = input.toCharArray();
    
    int i = 1, j = 1;
    while( i < ch.length){
        if(ch[i] != ch[i - 1])
            ch[j++] = ch[i];
        i++;
    }

    return new String(ch).substring(0, j);
}


