public static boolean areAnagrams (String one, String two) {
    if (one.length () == two.length ()) {
        String s0 = one.toLowerCase ();
        String s1 = two.toLowerCase ();
        HashMap < Character, Integer > chars = new HashMap < Character, Integer > (one.length ());
        Integer count;
        for (char c : s0.toCharArray ()) {
            count = chars.get (c);
            count = Integer.valueOf (count != null ? count + 1 : 1);
            chars.put (c, count);
        }
        for (char c : s1.toCharArray ()) {
            count = chars.get (c);
            if (count == null) {
                return false;
            } else {
                count --;
                chars.put (c, count);
            }
        }
        for (Integer i : chars.values ()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    } else {
        return false;
    }
}


 public static boolean areAnagrams (String one, String two) {
	if (one.length() == two.length()) {
	  int[] array1 = new int[128];
	  int[] array2 = new int[128];
	 
	  for (int i = 0; i < one.length(); i++) {
	    array1[one.charAt(i)]++;
	  }
	 
	  for (int i = 0; i < two.length(); i++) {
	    array2[two.charAt(i)]++;
	  }
	 
	  if (Arrays.equals(array1, array2)) {
	    return true;
	  }
	 
	  return false;
	}
}


