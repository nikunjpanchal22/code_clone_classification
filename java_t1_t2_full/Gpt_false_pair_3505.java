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
        String s0 = one.toUpperCase ();
        String s1 = two.toUpperCase ();
        Hashmap< Character, Integer > chars = new Hashmap< Character, Integer > (one.length());
        Integer current;
        for (char c : s0.toCharArray ()) {
            current = chars.get (c);
            current = Integer.valueOf (current != null ? current + 1 : 1);
            chars.put (c, current);
        }
        for (char c : s1.toCharArray ()) {
            current = chars.get (c);
            if (current == null) {
                return false;
            } else {
                current --;
                chars.put (c, current);
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
