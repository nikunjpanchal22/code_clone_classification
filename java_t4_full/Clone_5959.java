public static String removeAdjacentDuplicates (String input) {
    if (input.length () <= 1) {
        return input;
    }
    StringBuilder sb = new StringBuilder ();
    sb.append (input.charAt (0));
    IntStream.range (1, input.length ()).mapToObj (i -> input.charAt (i) != input.charAt (i - 1) ? input.charAt (i) : "").forEach (sb :: append);
    return sb.toString ();
}



public static String removeAdjacentDuplicates (String input) {
    if (input == null || input.length () <= 1) {
        return input;
    }
    char[] chars = input.toCharArray();
    StringBuilder sb = new StringBuilder();
    char previousChar = chars[0];
    sb.append(previousChar);

    for (int i = 1; i < chars.length; i++) {
        char currentChar = chars[i];
        if (currentChar != previousChar ) {
            sb.append(currentChar);
        }
        previousChar = currentChar;
    }

    return sb.toString();
}


