public static boolean contains (String a, String b) {
    int diff = a.length () - b.length ();
    while (a.length () > 0) {
        b = b.replace (a.substring (0, 1), "");
        a = a.replace (a.substring (0, 1), "");
        if (diff != a.length () - b.length ()) return false;
    }
    return true;
}


 public static boolean contains(String a, String b) {
    if (a.length() != b.length())
        return false;
    HashMap<Character, Integer> map = new HashMap<Character,Integer>();
    for(int i = 0; i < a.length(); i++) {
        char ch = a.charAt(i);
        if(map.containsKey(ch)) {
            int count = map.get(ch);
            map.put(ch, count + 1);
        } else {
            map.put(ch, 1);
        }
    }
    for(int i = 0; i < b.length(); i++) {
        char ch = b.charAt(i);
        if(map.containsKey(ch)) {
            int count = map.get(ch);
            map.put(ch, count - 1);
        } else {
            return false;
        }
    }
    for(Integer i : map.values()) {
        if(i != 0) {
            return false;
        }
    }
    return true;
}


