public boolean isAnagram (String s1, String s2) {
    StringBuilder sb1 = new StringBuilder ();
    StringBuilder sb2 = new StringBuilder ();
    if (s1.length () != s2.length ()) return false;
    char arr1 [] = s1.toCharArray ();
    char arr2 [] = s2.toCharArray ();
    Arrays.sort (arr1);
    Arrays.sort (arr2);
    for (char c : arr1) {
        sb1.append (c);
    }
    for (char c : arr2) {
        sb2.append (c);
    }
    System.out.println (sb1.toString ());
    System.out.println (sb2.toString ());
    if (sb1.toString ().equals (sb2.toString ())) return true;
    else return false;
}





public boolean isAnagram (String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    Map<Character, Integer> s1CharCount = new HashMap<>();
    Map<Character, Integer> s2CharCount = new HashMap<>();
    for (char c : s1.toCharArray()) {
        s1CharCount.put(c, s1CharCount.getOrDefault(c, 0) + 1);
    }
    for (char c : s2.toCharArray()) {
        s2CharCount.put(c, s2CharCount.getOrDefault(c, 0) + 1);
    }
    return s1CharCount.equals(s2CharCount);
}


