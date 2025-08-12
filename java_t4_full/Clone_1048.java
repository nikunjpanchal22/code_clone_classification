public static boolean isAnagram (String first, String second) {
    String positive = first.toLowerCase ();
    String negative = second.toLowerCase ();
    if (positive.length () != negative.length ()) {
        return false;
    }
    int [] counts = new int [26];
    int diff = 0;
    for (int i = 0;
    i < positive.length (); i ++) {
        int pos = (int) positive.charAt (i) - 97;
        if (counts [pos] >= 0) {
            diff ++;
        } else {
            diff --;
        }
        counts [pos] ++;
        int neg = (int) negative.charAt (i) - 97;
        if (counts [neg] <= 0) {
            diff ++;
        } else {
            diff --;
        }
        counts [neg] --;
    }
    return diff == 0;
}


 public static boolean isAnagram (String first, String second) {
	  String pos = first.toLowerCase();
	  String neg = second.toLowerCase();
	  if (pos.length() != neg.length()) {
	    return false;
	  }
	  StringBuilder sb = new StringBuilder();
	  sb.append(pos);
	  for (int i = 0; i < neg.length(); i++) {
	    char c = neg.charAt(i);
	    if (sb.indexOf(String.valueOf(c)) == -1) {
	      return false;
	    }
	    else {
	      sb.deleteCharAt(sb.indexOf(String.valueOf(c)));
	    }
	  }
	  return true;
}


