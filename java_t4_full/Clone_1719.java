public static String removeAdjacentDuplicates (String input) {
    if (input.length () <= 1) {
        return input;
    }
    StringBuilder sb = new StringBuilder ();
    sb.append (input.charAt (0));
    IntStream.range (1, input.length ()).mapToObj (i -> input.charAt (i) != input.charAt (i - 1) ? input.charAt (i) : "").forEach (sb :: append);
    return sb.toString ();
}


 public static String removeAdjacentDuplicates(String input){

	  if(input == null || input.length() <= 1){
	    return input;
	  } else {
	    int len = input.length();
	    char letter [] = input.toCharArray();
	    StringBuilder sb = new StringBuilder();

	    for(int i = 0; i < len-1; i++){
	      if(letter[i] != letter[i+1]){
		sb.append(letter[i]);
	      }
	    }
	    sb.append(letter[len-1]);
	    return sb.toString();
	  }
}


