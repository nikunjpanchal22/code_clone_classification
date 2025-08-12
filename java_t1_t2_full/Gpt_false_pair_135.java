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
	    int blockSize = 0;
	    int maxSize = 0;
	 
	    if (str.length() == 0) {
		return 0;
	    }
	 
	    for (int i = 0; i < str.length(); i++) {
		if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
		    blockSize++;
		    if (blockSize > maxSize) {
		        maxSize = blockSize;
		    }
		} else {
		    blockSize = 1;
		}
	    }
	    return maxSize;
}
