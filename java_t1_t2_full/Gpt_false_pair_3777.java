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


public static String decode (final String str) {
    final Pattern objPattern = Pattern.compile ("((\\d\\d)(#)|(\\d))");
    final Matcher objMatcher = objPattern.matcher (str);
    final StringBuffer objString = new StringBuffer ();
    String temp;
    while (objMatcher.find ()) {
        if (objMatcher.group (2) == null) {
            temp = objMatcher.group (1);
        } else {
            temp = objMatcher.group (2);
        }
        objString.append ((char) ((Integer.parseInt (temp) + 'a') - 1));
    }
    return objString.toString ();
}
