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


 public static boolean areAnagrams (String one, String two) {if (one.length() == two.length()) {
	  Map<Character, Integer> map = new HashMap<>();
	 
	  for (char c: one.toLowerCase().toCharArray()) {
	    if (map.containsKey(c)) {
	      map.put(c, map.get(c) + 1);
	    }
	    else {
	      map.put(c, 1);
	    }
	  }
	 
	  for (char c : two.toLowerCase().toCharArray()) {
	    if (!map.containsKey(c)) {
	      return false;
	    }
	    else {
	      int count = map.get(c);
	      if (count == 1) {
		map.remove(c);
	      }
	      else {
		map.put(c, count - 1);
	      }
	    }
	  }
	 
	  return map.isEmpty();
	  }
}


