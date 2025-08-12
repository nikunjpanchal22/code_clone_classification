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


 public static boolean isAnagram (String first, String second) {
    int[] letters = new int[26];
    first = first.toLowerCase ();
    second = second.toLowerCase ();
    if (second.length () != first.length ())
        return false;
    for (int i = 0; i < first.length (); i++)
        letters[first.charAt (i) - 'a']++;
    for (int i = 0; i < second.length (); i++)
        letters[second.charAt (i) - 'a']--;
    for (int i = 0; i < letters.length; i++) 
        if (letters[i] != 0) 
            return false;
    return true;
}


