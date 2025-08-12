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





public static boolean isAnagram(String s1,String s2) {
    int[] alphabet = new int[26];
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    for (int i=0; i<s1.length();i++) {
        alphabet[s1.charAt(i)-'a']++;
        alphabet[s2.charAt(i)-'a']--;
    }
    for (int i:alphabet) {
      if( i != 0 ) return false;
    }
    return true;
}


