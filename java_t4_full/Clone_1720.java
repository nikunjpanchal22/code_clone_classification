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

	  String res = "";
	  int i = 0;
	  
	  while (i < input.length()) {
	      if (i == 0) {
		  res = res + input.charAt(i);
		  i++;
	      } else {
		  if (input.charAt(i) != input.charAt(i-1)) {
		      res = res + input.charAt(i); 
		  }
		  i++;
	      }
	  }
	  return res;
}


