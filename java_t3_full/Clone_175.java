public static int maxBlock (String str) {
    int maxCounter = 1;
    int counter = 1;
    if (str.length () == 0) {
        return 0;
    }
    for (int i = 1;
    i < str.length (); i ++) {
        if (str.charAt (i - 1) == str.charAt (i)) {
            counter ++;
        } else {
            if (counter > maxCounter) {
                maxCounter = counter;
            }
            counter = 1;
        }
    }
    return Math.max (maxCounter, counter);
}


 public static int maxBlock(String str) {
	  int maxBlockSize = 0;
	  int currentBlockSize = 0;
	  char prevChar = str.charAt(0); // take first character as prev
	 
	  if (str.length() == 0) {
	    return 0;
	  }
	 
	  // traverse the entire string 
	  for (int index = 1; index < str.length(); index++) {
	    char currentChar = str.charAt(index);
	    // check if current char is same as previous
	    if (prevChar == currentChar) {
	      currentBlockSize++;
	      if (currentBlockSize > maxBlockSize) {
		maxBlockSize = currentBlockSize;
	      }
	    } else {
	      currentBlockSize = 0;
	    }
	    // update prev for next iteration 
	    prevChar = currentChar;
	  }
	  return (maxBlockSize + 1);
}


