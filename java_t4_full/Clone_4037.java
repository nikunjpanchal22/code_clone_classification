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
    String longest = "", cur = "";
    char[] chars = s.toCharArray();
    for (char c : chars) {
        if (cur.isEmpty() || cur.charAt(0) == c) cur += c;
        else cur = String.valueOf(c);
        if (cur.length() > longest.length()) longest = cur;
    }
    return longest;
}


