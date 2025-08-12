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


public static boolean checkAnagram (String first, String second) {
    String firm = first.toLowerCase ();
    String secnd = second.toLowerCase ();
    if (firm.length () != secnd.length ()) {
        return false;
    }
    int [] tally = new int [26];
    int variation = 0;
    for (int i = 0;
    i < firm.length (); i ++) {
        int posit = (int) firm.charAt (i) - 97;
        if (tally [posit] >= 0) {
            variation ++;
        } else {
            variation --;
        }
        tally [posit] ++;
        int negat = (int) secnd.charAt (i) - 97;
        if (tally [negat] <= 0) {
            variation ++;
        } else {
            variation --;
        }
        tally [negat] --;
    }
    return variation == 0;
}
