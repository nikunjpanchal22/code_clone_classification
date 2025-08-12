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
    int[] firstArray = new int[26];
    int[] secondArray = new int[26];
 
    // process each character in the strings by adding them to their respective arrays
    for(int i=0; i<first.length(); i++){
        firstArray[first.charAt(i) - 'a']++;
        secondArray[second.charAt(i) - 'a']++;
    }
 
    // check if the contents of the two array are exactly the same
    for(int i=0; i<26; i++){
        if(firstArray[i] != secondArray[i]){
            return false;
        }
    }
 
    return true;
}


