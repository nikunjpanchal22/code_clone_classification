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
        String longest = "" + s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            String substr = getContinuousCharSubstring(s, s.charAt(i), i);
            if (substr.length() > longest.length()) longest = substr;
        }
        return longest;
    }
    private String getContinuousCharSubstring(String s, char chr, int start) {
        StringBuilder substr = new StringBuilder();
        while (start < s.length() && s.charAt(start) == chr) {
            substr.append(chr);
            start++;
        }
        return substr.toString();
}


