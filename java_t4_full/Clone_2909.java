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

    StringBuilder sb = new StringBuilder(s2);

    for (char c : s1.toCharArray()) {
        int index = sb.indexOf(String.valueOf(c));

        if (index != -1) {
            sb.deleteCharAt(index);
        } else {
            return false;
        }
    }

    return sb.length() == 0;
}


