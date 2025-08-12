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
    int currentLength = 1; 
    char currentChar = s.charAt(0);
    String longestString = "" + currentChar;
    int maxLength = 1;
    int startIndex = 0;
    int endIndex = 0;
    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == currentChar) {
            endIndex = i;
            currentLength ++;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestString = s.substring (startIndex, endIndex+1);
            }
        }
        else {
            currentChar = s.charAt(i);
            startIndex = i;
            currentLength = 1;
        }
    }
    return longestString;
}


