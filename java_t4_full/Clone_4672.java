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




public static String decrypt (final String msg) {
    StringBuilder result = new StringBuilder ();
    Pattern.compile ("((\\d\\d)(#)|(\\d))").matcher(msg).results().forEachOrdered(res ->
        result.append((char) ((Integer.parseInt(res.group(res.group(2) == null ? 1:2)) + 'a') - 1)));
    return result.toString();
}


