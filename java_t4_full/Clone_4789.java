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
    List<String> s1List = new ArrayList<>(Arrays.asList(s1.split("")));
    List<String> s2List = new ArrayList<>(Arrays.asList(s2.split("")));
    Collections.sort(s1List);
    Collections.sort(s2List);
    return s1List.equals(s2List);
}


