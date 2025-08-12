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
    String output = "" + input.charAt(0);
    for (int i = 1; i < input.length(); i++)
        if (input.charAt(i) != input.charAt(i - 1))
            output = output.concat(Character.toString(input.charAt(i)));
    return output;
}


