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


 public static boolean isAnagram(String first, String second){
	  String positive = first.toLowerCase();
	  String negative = second.toLowerCase();
	  if (positive.length() != negative.length()) {
	    return false;
	  }
	  Map<Character, Integer> counts = new HashMap<>();
	  for (int i = 0; i < positive.length(); i++) {
	    char pos = positive.charAt(i);
	    char neg = negative.charAt(i); 
	    counts.putIfAbsent(pos, 0);
	    counts.put(pos, counts.get(pos)+1); 
	    counts.putIfAbsent(neg, 0);
	    counts.put(neg, counts.get(neg)-1); 
	  }
	  for (Integer num : counts.values()) {
	    if (num != 0) {
	      return false;
	    }
	  }
	  return true;
}


