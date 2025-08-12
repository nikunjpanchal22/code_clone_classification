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
	if (one.length () == two.length ()) {
	  Map<Character, Integer> map1 = new HashMap<>();
	  Map<Character, Integer> map2 = new HashMap<>();

	  for (char c : one.toLowerCase().toCharArray()) {
	    if (map1.containsKey(c)) {
	      map1.put(c, map1.get(c) + 1);
	    }
	    else {
	      map1.put(c, 1);
	    }
	  }

	  for (char c : two.toLowerCase().toCharArray()) {
	    if (map2.containsKey(c)) {
	      map2.put(c, map2.get(c) + 1);
	    }
	    else {
	      map2.put(c, 1);
	    }
	  }

	  for(Map.Entry<Character, Integer> entry1 : map1.entrySet()) {
	    Character key = entry1.getKey();
	    Integer value = entry1.getValue();
	     if(value != map2.get(key))
	      return false;
	  }
	 
	  return true;
	}
}


