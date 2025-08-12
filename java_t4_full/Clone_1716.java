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

	  if (input.length() <= 1) {
	    return input;
	  }
	 
	  int len = input.length();

	  StringBuilder sb = new StringBuilder();
	  char prev = input.charAt(0);
	  sb.append(prev);
	 
	  for (int i = 1; i < len; i++) {
	    char curr = input.charAt(i);
	    
	    if (curr != prev) {
	      sb.append(curr);
	      prev = curr;
	    }
	  }
	 
	  return sb.toString();
}


