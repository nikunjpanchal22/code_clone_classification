public static boolean isAnagram (String s1, String s2) {
    if (s1.length () != s2.length ()) {
        return false;
    }
    for (int i = 0;
    i < s2.length (); i ++) {
        if (! s1.contains ("" + s2.charAt (i))) {
            return false;
        }
        s1 = s1.replaceFirst ("" + s2.charAt (i), "");
        s2 = s2.replaceFirst ("" + s2.charAt (i), "");
    }
    return true;
}



 


public static boolean isAnagram(String s1, String s2) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s1.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (char c : s2.toCharArray()) {
        if (!map.containsKey(c)) {
            return false;
        }
        if (map.get(c) == 1) {
            map.remove(c);
        } else {
            map.put(c, map.get(c) - 1);
        }
    }
    return map.isEmpty();
}


