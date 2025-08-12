public static String decrypt (final String msg) {
    final Pattern regex = Pattern.compile ("((\\d\\d)(#)|(\\d))");
    final Matcher regexMatcher = regex.matcher (msg);
    final StringBuffer result = new StringBuffer ();
    String c;
    while (regexMatcher.find ()) {
        if (regexMatcher.group (2) == null) {
            c = regexMatcher.group (1);
        } else {
            c = regexMatcher.group (2);
        }
        result.append ((char) ((Integer.parseInt (c) + 'a') - 1));
    }
    return result.toString ();
}


public static String decodeMessage (final String message) {
    final Pattern infoPattern = Pattern.compile ("((\\d\\d)(#)|(\\d))");
    final Matcher infoMatcher = infoPattern.matcher (message);
    final StringBuffer outputString = new StringBuffer ();
    String temp;
    while (infoMatcher.find ()) {
        if (infoMatcher.group (2) == null) {
            temp = infoMatcher.group (1);
        } else {
            temp = infoMatcher.group (2);
        }
        outputString.append ((char) ((Integer.parseInt (temp) + 'a') - 1));
    }
    return outputString.toString ();
}
