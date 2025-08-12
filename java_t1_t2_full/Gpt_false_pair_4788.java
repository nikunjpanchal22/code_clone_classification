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


public static boolean isAnagram (String str1, String str2) {
    String alpha = str1.toLowerCase ();
    String beta  = str2.toLowerCase ();
    if (alpha.length () != beta.length ()) {
        return false;
    }
    int [] arr = new int [26];
    int var = 0;
    for (int i = 0;
    i < alpha.length (); i ++) {
        int a = (int) alpha.charAt (i) - 97;
        if (arr [a] >= 0) {
            var ++;
        } else {
            var --;
        }
        arr [a] ++;
        int b = (int) beta.charAt (i) - 97;
        if (arr [b] <= 0) {
            var ++;
        } else {
            var --;
        }
        arr [b] --;
    }
    return var == 0;
}
