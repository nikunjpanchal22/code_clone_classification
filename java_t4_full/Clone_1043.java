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
	  String positive = first.toLowerCase();
	  String negative = second.toLowerCase();
	  if (positive.length() != negative.length()) {
	    return false;
	  }
	  char[] pos = positive.toCharArray();
	  char[] neg = negative.toCharArray();
	  int[] count = new int[26];
	  for (char c : pos) {
	    count[c-97]++;
	  }
	  for (char c : neg) {
	    count[c-97]--;
	  }
	  for (int n : count) {
	    if (n != 0) {
	      return false;
	    }
	  }
	  return true;
}


