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

	  String ans = "";
	  int n = input.length();
	  for (int i=0; i<n; i++)
	  {
	  // Picking a character from input String
	  char ch2 = input.charAt(i);

	  // Last character of string isn't compared with its previous
	    if (i == n-1) {
	      ans = ans + ch2;
	    }
	    else if (input.charAt(i+1) == ch2) { 
	      continue;
	    }
	    else {
	      ans = ans + ch2;
	    }
	  }
	  return ans;
}


