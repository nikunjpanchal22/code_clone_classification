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
   int longestStart = 0, longestEnd = 0;
   int start = 0;
   for (int i = 1; i < s.length(); ++i) {
       if (s.charAt(i) != s.charAt(i - 1)) {
           if (i - start > longestEnd - longestStart) {
               longestStart = start;
               longestEnd = i;
           }
           start = i;
       }
   }
   return s.substring(longestStart, longestEnd);
}


