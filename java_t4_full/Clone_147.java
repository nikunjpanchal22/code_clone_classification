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
	  int maxSize = 0;
	  int tempCounter = 0;
	 
	  if(str.length() == 0){
	    maxSize = 0;
	  }
	 
	  for(int i = 0; i < str.length() - 1; i++){
	    if(str.charAt(i) == str.charAt(i + 1)){
	      tempCounter++;
	      if(tempCounter > maxSize)
		maxSize = tempCounter;
	    }
	    else
	      tempCounter = 0;
	  }
	 
	  return maxSize + 1;
}


