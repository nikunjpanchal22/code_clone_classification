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




public boolean isAnagram(String s1, String s2) {
    if(s1.length() != s2.length()) return false;
    Map<Character, Integer> occurrences = new HashMap<>();
    for(int i = 0; i < s1.length(); i++) {
        occurrences.put(s1.charAt(i), occurrences.getOrDefault(s1.charAt(i), 0) + 1);
        occurrences.put(s2.charAt(i), occurrences.getOrDefault(s2.charAt(i), 0) - 1);
    }
    for(Integer val : occurrences.values()) {
        if(val != 0) return false;
    }
    return true;
}


