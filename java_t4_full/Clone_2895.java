public static boolean isAnagram (String s1, String s2) {
    if (s1.length () != s2.length ()) {
        return false;
    }
    s1 = s1.toLowerCase ();
    s2 = s2.toLowerCase ();
    char [] c1 = s1.toCharArray ();
    char [] c2 = s2.toCharArray ();
    Arrays.sort (c1);
    Arrays.sort (c2);
    String sc1 = new String (c1);
    String sc2 = new String (c2);
    return sc1.equals (sc2);
}



public static boolean isAnagram (String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    Map<Character, Integer> map = new HashMap<>();
    for(int i = 0; i < s1.length(); i++){
        map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
    }
    for(char c : map.keySet()){
        if(map.get(c) != 0){
            return false;
        }
    }
    return true;
}


