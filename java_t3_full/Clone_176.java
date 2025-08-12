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
	    int maxblockSize = 0;
	    char prevChar;

	    if (str.length() == 0) {
		return 0;
	    }
	    prevChar = str.charAt(0);
	    for (int i = 1; i < str.length(); i++) {
		if (str.charAt(i) == prevChar) {
		    blockSize++;
		    if (blockSize > maxblockSize) {
		        maxblockSize = blockSize;
		    }
		}
		else {
		    blockSize = 0;
		}
		prevChar = str.charAt(i);
	    }
	    return maxblockSize + 1;
}


