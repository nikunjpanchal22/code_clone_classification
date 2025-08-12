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

	  StringBuilder sb = new StringBuilder();
	  char previousChar = input.charAt(0);
	  sb.append(previousChar);

	  for (int i = 1; i < input.length(); i++) {
	    char currentChar = input.charAt(i);
	    if (currentChar != previousChar)
	      sb.append(currentChar);
	    previousChar = currentChar;
	  }

	  return sb.toString();
}


