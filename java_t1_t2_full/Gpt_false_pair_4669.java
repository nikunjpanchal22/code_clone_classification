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


public static boolean isAnagram (String firstInput, String secondInput) {
    String lowerCaseFirstString = firstInput.toLowerCase();
    String lowerCaseSecondString = secondInput.toLowerCase();
    if (lowerCaseFirstString.length() != lowerCaseSecondString.length()) {
        return false;
    }
    int[] countsOfLetters = new int[26];
    int Difference = 0;
    for (int i = 0; i < lowerCaseFirstString.length(); i++) {
        int lowerCaseFirstStringPosition = (int) lowerCaseFirstString.charAt(i) - 97;
        if (countsOfLetters[lowerCaseFirstStringPosition] >= 0) {
            Difference++;
        } 
        else {
            Difference--;
        }
        countsOfLetters[lowerCaseFirstStringPosition]++;
        int lowerCaseSecondStringPosition = (int) lowerCaseSecondString.charAt(i) - 97;
        if (countsOfLetters[lowerCaseSecondStringPosition] <= 0) {
            Difference++;
        } 
        else {
            Difference--;
        }
        countsOfLetters[lowerCaseSecondStringPosition]--;
    }
    return Difference == 0;
}
