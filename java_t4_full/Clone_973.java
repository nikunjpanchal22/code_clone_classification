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


 public static String decrypt(final String msg) {
    Pattern pattern = Pattern.compile("((\\d+)(#)|(\\d))");
    Matcher matcher = pattern.matcher(msg);
    StringBuffer sb = new StringBuffer();
    while (matcher.find()) {
        String c;
        c = matcher.group(2) == null ? matcher.group(1) : matcher.group(2);
        char character = (char) ((Integer.parseInt(c) + 'a') - 1);
        sb.append(character);
    }
    return sb.toString();
}


