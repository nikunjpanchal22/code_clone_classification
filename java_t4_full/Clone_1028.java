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
    first = first.toLowerCase(); 
    second = second.toLowerCase(); 
    if (first.length() != second.length()) 
        return false; 
    int[] charactersFrequency1 = new int[26]; 
    int[] charactersFrequency2 = new int[26]; 
    for (int i = 0; i < first.length(); i++) 
    { 
        char ch = first.charAt(i); 
        charactersFrequency1[ch - 'a']++; 
        char c = second.charAt(i); 
        charactersFrequency2[c - 'a']++; 
    } 
    for (int i = 0; i < 26; i++) 
    { 
        if (charactersFrequency1[i] != charactersFrequency2[i]) 
            return false; 
    } 
    return true; 
}


