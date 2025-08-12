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
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    int[] letters = new int[128];

    for (char c : s1.toCharArray()) {
        letters[c]++;
    }
    for (char c : s2.toCharArray()) {
        letters[c]--;
    }

    for (int i : letters) {
        if (i != 0) {
            return false;
        }
    }

    return true;
}


