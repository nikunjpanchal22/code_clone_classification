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


public static boolean isAnagramType3 (String first, String second) 
{
    String positive = first.toLowerCase();
    String negative = second.toLowerCase();
    if (positive.length() != negative.length()) {
        return false;
    }
    int[] counts = new int[26];
    int diff = 0;
    for (int i = 0; i < positive.length(); i++) {
        int pos = positive.charAt(i) - 'a';
        if (counts[pos] >= 0) {
            diff++;
        } else {
            diff--;
        }
        counts[pos]++;
        int neg = negative.charAt(i) - 'a';
        if (counts[neg] <= 0) {
            diff++;
        } else {
            diff--;
        }
        counts[neg]--;
    }
    return diff == 0;
}
