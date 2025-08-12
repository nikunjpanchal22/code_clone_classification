public static String removeAdjacentDuplicates (String input) {
    if (input.length () <= 1) {
        return input;
    }
    StringBuilder sb = new StringBuilder ();
    sb.append (input.charAt (0));
    IntStream.range (1, input.length ()).mapToObj (i -> input.charAt (i) != input.charAt (i - 1) ? input.charAt (i) : "").forEach (sb :: append);
    return sb.toString ();
}


 public static String removeAdjacentDuplicates(String input) {
    if (input == null || input.isEmpty()) {
        return input;
    }
    String result = "";
    for (int i = 0; i < input.length(); i++) {
        if (i == 0) {
            result = String.valueOf(input.charAt(0));
            continue;
        }
        char currentChar = input.charAt(i);
        char prevChar = input.charAt(i - 1);
        if (currentChar != prevChar) {
            result += currentChar;
        }
    }
    return result;
}


