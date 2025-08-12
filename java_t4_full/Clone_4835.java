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
    if (s1.length () != s2.length ()) return false;
    char[] str1 = s1.replaceAll("[\\W]", "").toLowerCase().toCharArray();
    char[] str2 = s2.replaceAll("[\\W]", "").toLowerCase().toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);
}


