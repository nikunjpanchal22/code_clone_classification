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
	  if (input.length() < 2) {
	    return input;
	  }

	  char[] chars = input.toCharArray();
	  int j = 0; // index of the next character to be put in the new string
	 
	  for (int i = 1; i < chars.length; i++) {
	    if (chars[i] != chars[j]) {
	      chars[++j] = chars[i];
	    }
	  }
	 
	  return new String(chars, 0, j + 1);
}


