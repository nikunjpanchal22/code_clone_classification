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
    String positive = first.toLowerCase ();
    String negative = second.toLowerCase ();
    if (positive.length () != negative.length ()) {
        return false;
    }
    int [] counters = new int [26];
    int change = 0;
    for (int index = 0;
    index < positive.length (); index ++) {
        int positiveNumber = (int) positive.charAt (index) - 97;
        if (counters [positiveNumber] >= 0) {
            change ++;
        } else {
            change--;
        }
        counters [positiveNumber] ++;
        int negativeNumber = (int) negative.charAt (index) - 97;
        if (counters [negativeNumber] <= 0) {
            change ++;
        } else {
            change--;
        }
        counters [negativeNumber] --;
    }
    return change == 0;
}
