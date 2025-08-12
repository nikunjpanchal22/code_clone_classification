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





public static boolean isAnagram(String word, String anagram) {
    if (word.length() != anagram.length()) {
        return false;
    } else {
        char[] wordArray = word.toLowerCase().toCharArray();
        char[] anagramArray = anagram.toLowerCase().toCharArray();
        for (int i = 0; i<wordArray.length; i++) {
            int index = new String(anagramArray).indexOf(wordArray[i]);
            if (index != -1) {
                anagramArray = (new String(anagramArray).substring(0, index) + new String(anagramArray).substring(index + 1)).toCharArray();
            } else {
               return false;
            }
        }
        return true;
    }
}


