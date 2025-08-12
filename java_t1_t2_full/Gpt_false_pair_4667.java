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


public static boolean isEqual (String first, String second) {
    String alpha = first.toLowerCase ();
    String alpho = second.toLowerCase ();
    if (alpha.length () != alpho.length ()) {
        return false;
    }
    int [] count = new int [26];
    int differ = 0;
    for (int i = 0;
    i < alpha.length (); i ++) {
        int posi = (int) alpha.charAt (i) - 97;
        if (count [posi] >= 0) {
            differ ++;
        } else {
            differ --;
        }
        count [posi] ++;
        int negat = (int) alpho.charAt (i) - 97;
        if (count [negat] <= 0) {
            differ ++;
        } else {
            differ --;
        }
        count [negat] --;
    }
    return differ == 0;
}
