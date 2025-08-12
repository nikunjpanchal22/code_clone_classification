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





public String getLongestSubstring(String s) {
    if (s == null || s.equals("")) return null;
    int i = 0, j = 0, maxlen = 0, start = 0;
    while (j < s.length()) {
        if (s.charAt(i) != s.charAt(j)) {
            if (j - i > maxlen) { maxlen = j - i; start = i; }
            i = j;
        }
        j++;
    }
    return s.substring(start, start + maxlen);
}


