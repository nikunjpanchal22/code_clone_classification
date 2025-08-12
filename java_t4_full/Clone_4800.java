public static boolean isAnagram (String first, String second) {
    String positive = first.toLowerCase ();
    String negative = second.toLowerCase ();
    if (positive.length () != negative.length ()) {
        return false;
    }
    int [] counts = new int [26];
    int diff = 0;
    for (int i = 0;
    i < positive.length (); i ++) {
        int pos = (int) positive.charAt (i) - 97;
        if (counts [pos] >= 0) {
            diff ++;
        } else {
            diff --;
        }
        counts [pos] ++;
        int neg = (int) negative.charAt (i) - 97;
        if (counts [neg] <= 0) {
            diff ++;
        } else {
            diff --;
        }
        counts [neg] --;
    }
    return diff == 0;
}





public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
        return false;
    }

    int[] characterCount = new int[26];
    s1 = s1.toLowerCase();
    for (int i = 0; i < s1.length(); i++) {
        characterCount[s1.charAt(i) - 97]++;
        characterCount[s2.charAt(i) - 97]--;
    }

    for (int i : characterCount) {
        if (i != 0) {
            return false;
        }
    }

    return true;
}


