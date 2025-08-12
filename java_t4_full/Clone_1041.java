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
	  Map<Character, Integer> counts = new HashMap<>();
	  for (char c : pos.toCharArray()) {
	    if (counts.containsKey(c)) {
	      counts.put(c, counts.get(c) + 1);
	    } else {
	      counts.put(c, 1);
	    }
	  }
	  for (char c : neg.toCharArray()) {
	    if (counts.containsKey(c)) {
	      counts.put(c, counts.get(c) - 1);
	    } else {
	      return false;
	    }
	  }
	  for (int num : counts.values()) {
	    if (num != 0) {
	      return false;
	    }
	  }
	  return true;
}


