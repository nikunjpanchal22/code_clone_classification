static boolean isAnagram (String s1, String s2) {
    if (s1.length () != s2.length ()) return false;
    int n = s1.length ();
    int [] charMap = new int [256];
    for (int i = 0;
    i < n; i ++) {
        char c1 = s1.charAt (i);
        charMap [c1] ++;
        char c2 = s2.charAt (i);
        charMap [c2] --;
    }
    for (int i = 0;
    i < charMap.length; i ++) {
        if (charMap [i] != 0) return false;
    }
    return true;
}





static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    char[] s1Array = s1.toCharArray();
    char[] s2Array = s2.toCharArray();

    Arrays.sort(s1Array);
    Arrays.sort(s2Array);

    return Arrays.equals(s1Array, s2Array);
}


