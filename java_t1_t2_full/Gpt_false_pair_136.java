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
	 
	    if (str.length() == 0) {
		return 0;
	    }
	 
	    for (int i = 0; i < str.length(); i++) {
		if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
		    currentBlockSize++;
		    if (currentBlockSize > maxBlockSize) {
		        maxBlockSize = currentBlockSize;
		    }
		}
		else {
		    currentBlockSize = 1;
		}
	    }
	 
	    return maxBlockSize;
}
