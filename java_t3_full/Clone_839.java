public String getLongestSubstring (String s) {
    if (s.length () == 0) return null;
    char currentChar = s.charAt (0);
    String longestString = "" + currentChar;
    String runningString = "" + currentChar;
    int currentLongestLength = 1;
    for (int i = 1;
    i < s.length (); i ++) {
        if (s.charAt (i) == currentChar) {
            runningString = runningString + currentChar;
            if (runningString.length () > longestString.length ()) {
                currentLongestLength ++;
                longestString = runningString;
            }
        } else {
            runningString = "" + s.charAt (i);
        }
    }
    return longestString;
}


 public String getLongestSubstring (String s) {
    if (s.length () == 0) return null;
    char currentChar = s.charAt (0);
    int startIndex = 0;
    int endIndex = 0;
    int longestLength = 1;
    String longestString = "" + currentChar;
    int currLength = 1;
    for (int i = 1; i < s.length (); i++) {
        if (s.charAt (i) == currentChar) {
            endIndex ++;
            String subString = s.substring (startIndex, endIndex+1);
            if (subString.length () > longestLength) {
                longestLength = subString.length ();
                longestString = subString;
            }
        } else {
            currentChar = s.charAt (i);
            startIndex = i;
            currLength = 1;
        }
    }
    return longestString;
}


