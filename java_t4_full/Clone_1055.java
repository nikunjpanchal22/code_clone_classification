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
	   String s0 = one.toLowerCase(); 
	   String s1 = two.toLowerCase();

	   s0 = s0.replaceAll("\\s+", "");
	   s1 = s1.replaceAll("\\s+", "");

	   Char[] oneChars = s0.toCharArray(); 
	   Char[] twoChars = s1.toCharArray(); 

	   Arrays.sort(oneChars);
	   Arrays.sort(twoChars);

	   return Arrays.equals(oneChars, twoChars);
	}
}


