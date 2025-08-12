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

    if (input.length() <= 1)
        return input;

    StringBuilder output = new StringBuilder();
    int j = 0;
    while (input.length() - j > 0) {
        int i = j + 1;
        char current = input.charAt(j);
        while (i < input.length()) {
            if (input.charAt(i - 1) != input.charAt(i)) {
                current = input.charAt(i);
                break;
            }
            i++;
        }
        output.append(current);
        j = i;
    }
    return output.toString();
}


