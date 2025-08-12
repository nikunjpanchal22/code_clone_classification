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
    if (s1.length() != s2.length()) {
        return false;
    }
    List<Character> s1List = s1.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
    List<Character> s2List = s2.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
    Collections.sort(s1List);
    Collections.sort(s2List);
    return s1List.equals(s2List);
}


