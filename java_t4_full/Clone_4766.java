private static boolean isAnagram (String s1, String s2) {
    if (s1.length () != s2.length ()) return false;
    int [] seen = new int [256];
    Arrays.fill (seen, 0);
    s1 = s1.toLowerCase ();
    s2 = s2.toLowerCase ();
    for (int i = 0;
    i < s1.length (); i ++) {
        seen [s1.charAt (i)] = seen [s1.charAt (i)] + 1;
    }
    for (int i = 0;
    i < s2.length (); i ++) {
        if (seen [s2.charAt (i)] == 0) return false;
        seen [s2.charAt (i)] = seen [s2.charAt (i)] - 1;
    }
    for (int i = 0;
    i < 256; i ++) {
        if (seen [i] != 0) return false;
    }
    return true;
}




private static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length())
        return false;
    int[] counter = new int['z' - 'a' + 1];
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    for (int i = 0; i < s1.length(); i++) {
        counter[s1.charAt(i) - 'a']++;
        counter[s2.charAt(i) - 'a']--;
    }
    for (int count : counter)
        if (count != 0)
            return false;
    return true;
}


