private static boolean isPermutation (String a, String b) {
    char [] aArray = a.toCharArray ();
    char [] bArray = b.toCharArray ();
    if (a.length () != b.length ()) {
        return false;
    }
    int found = 0;
    for (int i = 0;
    i < aArray.length; i ++) {
        char eachA = aArray [i];
        for (int k = 0;
        k < bArray.length; k ++) {
            if (eachA == bArray [k]) {
                found ++;
                bArray [k] = '\uFFFF';
                break;
            }
        }
    }
    return found == a.length ();
}


  private static boolean isPermutation (String a, String b) {
    if (a == null || b == null) {
        return false;
    }
    int aLength = a.length();
    int bLength = b.length();
    if (aLength != bLength) {
        return false;
    }
    char[] aChars = a.toCharArray();
    int[] charCount = new int[26];
    for (char c : aChars) {
        charCount[c - 'a']++;
    }
    for (int i = 0; i < bLength; i++) {
        int c = b.charAt(i) - 'a';
        charCount[c]--;
        if (charCount[c] < 0) {
            return false;
        }
    }
    return true;
}


