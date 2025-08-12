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
    if(word.length() != anagram.length()) {
        return false;
    }
    char[] chars = word.toCharArray();
    for(char c : chars) {
        int index = anagram.indexOf(c);
        if(index != -1) {
            anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
        } else {
            return false;
        }
    }
    return anagram.isEmpty();
}


