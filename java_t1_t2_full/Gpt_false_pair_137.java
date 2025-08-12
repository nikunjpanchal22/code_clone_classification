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
	    int maxCounter = 0;
	    int counter = 0;
	    if (str.length() == 0) {
		return 0;
	    }
	    for(int i = 1; i < str.length(); i++) {
		if (str.charAt(i) == str.charAt(i-1)) {
		    counter++;
		    if (counter > maxCounter) {
		        maxCounter = counter;
		    }
		} else {
		    counter = 0;
		}
	    }
	    return Math.max(maxCounter, counter) +1;
}
