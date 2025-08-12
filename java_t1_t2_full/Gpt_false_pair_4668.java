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


public static boolean isAnagram (String firstInputString, String secondInputString) {
    String lowerCaseStringOne = firstInputString.toLowerCase();
    String lowerCaseStringTwo = secondInputString.toLowerCase();
    if (lowerCaseStringOne.length() != lowerCaseStringTwo.length()) {
        return false;
    }
    int[] countOfLetter = new int[26];
    int mismatchDifference = 0;
    for (int index = 0; index < lowerCaseStringOne.length(); index++) {
        int lowerCaseStringOneIndex = (int) lowerCaseStringOne.charAt(index) - 97;
        if (countOfLetter[lowerCaseStringOneIndex] >= 0) {
            mismatchDifference++;
        } 
        else {
            mismatchDifference--;
        }
        countOfLetter[lowerCaseStringOneIndex]++;
        int lowerCaseStringTwoIndex = (int) lowerCaseStringTwo.charAt(index) - 97;
        if (countOfLetter[lowerCaseStringTwoIndex] <= 0) {
            mismatchDifference++;
        } 
        else {
            mismatchDifference--;
        }
        countOfLetter[lowerCaseStringTwoIndex]--;
    }
    return mismatchDifference == 0;
}
