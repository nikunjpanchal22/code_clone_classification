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
    String copy1= first.toLowerCase ();
    String copy2 = second.toLowerCase ();
    if (copy1.length () != copy2.length ()) {
        return false;
    }
    int [] count = new int [26];
    int difference = 0;
    for (int i = 0;
    i < copy1.length (); i ++) {
        int pos = (int) copy1.charAt (i) - 97;
        if (count [pos] >= 0) {
            difference ++;
        } else {
            difference --;
        }
        count [pos] ++;
        int neg = (int) copy2.charAt (i) - 97;
        if (count [neg] <= 0) {
            difference ++;
        } else {
            difference --;
        }
        count [neg] --;
    }
    return difference == 0;
}
