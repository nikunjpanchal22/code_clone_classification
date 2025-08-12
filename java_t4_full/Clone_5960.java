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
    int length = input.length();
    if (length <= 1)
        return input;
        
    char[] charArray = input.toCharArray();
    int j = 0;

    for (int i = 1; i < length; i++) {
        if (charArray[i] != charArray[j]) {
            j++;
            charArray[j] = charArray[i];
        }
    }
    return new String(charArray, 0, j + 1);        
}


