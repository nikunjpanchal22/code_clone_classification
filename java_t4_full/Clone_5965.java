public static String removeAdjacentDuplicates (String input) {
    if (input.length () <= 1) {
        return input;
    }
    StringBuilder sb = new StringBuilder ();
    sb.append (input.charAt (0));
    IntStream.range (1, input.length ()).mapToObj (i -> input.charAt (i) != input.charAt (i - 1) ? input.charAt (i) : "").forEach (sb :: append);
    return sb.toString ();
}





public static String removeAdjacentDuplicates(String str) {
    String out = "" + str.charAt(0);
    for (int i = 1; i < str.length(); i++)
        if (str.charAt(i) != str.charAt(i - 1))
            out += str.charAt(i);
    return out;
}


