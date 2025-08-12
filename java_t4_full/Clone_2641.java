public static int maxBlock (String str) {
    int maxCounter = 1;
    int counter = 1;
    if (str.length () == 0) {
        return 0;
    }
    for (int i = 1;
    i < str.length (); i ++) {
        if (str.charAt (i - 1) == str.charAt (i)) {
            counter ++;
        } else {
            if (counter > maxCounter) {
                maxCounter = counter;
            }
            counter = 1;
        }
    }
    return Math.max (maxCounter, counter);
}



 

public static int maxBlock(String str) {
    return str.isEmpty() ? 0 : java.util.regex.Pattern.compile("(.)\\1*").matcher(str).results().mapToInt(java.util.regex.MatchResult::end).max().orElse(1);
}


