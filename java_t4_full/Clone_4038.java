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
    if (s.isEmpty()) return null;
    String longest = "" + s.charAt(0), current = longest;
    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == current.charAt(0)) current += s.charAt(i);
        else current = "" + s.charAt(i);
        if (current.length() > longest.length()) longest = current;
    }
    return longest;
}


