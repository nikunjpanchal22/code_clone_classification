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
	 
	  int index = 0;
	  char[] inputAsCharArray = input.toCharArray();
	  int i = 0;
	 
	  while (i < inputAsCharArray.length) {
	 
	    if (index == 0 || (inputAsCharArray[index - 1] != inputAsCharArray[i])) {
	      inputAsCharArray[index] = inputAsCharArray[i];
	      index++;
	    }
	    i++;
	  }
	  return new String(inputAsCharArray, 0, index);
}


