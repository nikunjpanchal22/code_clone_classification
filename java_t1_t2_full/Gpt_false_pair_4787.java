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
    String x = first.toLowerCase ();
    String y = second.toLowerCase ();
    if (x.length () != y.length ()) {
        return false;
    }
    int [] freq = new int [26];
    int diff = 0;
    for (int i = 0;
    i < x.length (); i ++) {
        int asciiX = (int) x.charAt (i) - 97;
        if (freq [asciiX] >= 0) {
            diff ++;
        } else {
            diff --;
        }
        freq [asciiX] ++;
        int asciiY = (int) y.charAt (i) - 97;
        if (freq [asciiY] <= 0) {
            diff ++;
        } else {
            diff --;
        }
        freq [asciiY] --;
    }
    return diff == 0;
}
