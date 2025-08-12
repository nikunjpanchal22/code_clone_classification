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





public static boolean isAnagram(String first, String second) {
    if (first.length() != second.length()) return false;
    first = first.toLowerCase();
    second = second.toLowerCase();
    int[] letters = new int[26];
    for (int i = 0; i < first.length(); i++) {
        letters[first.charAt(i) - 'a']++;
        letters[second.charAt(i) - 'a']--;
    }
    for (int i : letters)
        if (i != 0) return false;
    return true;
}


