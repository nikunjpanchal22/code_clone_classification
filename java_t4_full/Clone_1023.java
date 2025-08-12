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
    first = first.toLowerCase ();
    second = second.toLowerCase ();
    int[] counts = new int[26];
    if (first.length () != second.length()) 
        return false;
    for (int i = 0; i < first.length(); i++) {
        counts[first.charAt(i) - 'a']++;
        counts[second.charAt(i) - 'a']--;
    }
    for (int count : counts) {
        //go through each element in array and check if any, other than 0
        if (count != 0) {
            return false;
        }
    }
    return true;
}


