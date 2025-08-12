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
    if (s1.length () != s2.length ()) return false;
    int[] counter = new int[26];
    for (int i = 0; i < s1.length(); i++) {
        counter[s1.charAt(i) - 'a']++;
        counter[s2.charAt(i) - 'a']--;
    }
    for (int count : counter) {
        if (count != 0) return false;
    }
    return true;
}


