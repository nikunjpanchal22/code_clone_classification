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
    String duplicate1= first.toLowerCase ();
    String duplicate2 = second.toLowerCase ();
    if (duplicate1.length () != duplicate2.length ()) {
        return false;
    }
    int [] numbers = new int [26];
    int variation = 0;
    for (int i = 0;
    i < duplicate1.length (); i ++) {
        int copy1 = (int) duplicate1.charAt (i) - 97;
        if (numbers [copy1] >= 0) {
            variation ++;
        } else {
            variation --;
        }
        numbers [copy1] ++;
        int copy2 = (int) duplicate2.charAt (i) - 97;
        if (numbers [copy2] <= 0) {
            variation ++;
        } else {
            variation --;
        }
        numbers [copy2] --;
    }
    return variation == 0;
}
