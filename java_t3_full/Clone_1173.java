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
    final Pattern pattern = Pattern.compile("(#|(\\d\\d)|(\\d))");
    final Matcher matcher = pattern.matcher(msg);
    StringBuffer stringBuffer = new StringBuffer();
    char decryptChar;
    while (matcher.find()) {
        if (matcher.group(2) == null) {
            decryptChar = (char) (Integer.parseInt(matcher.group(1)) + 'a' - 1);
        } else {
            decryptChar = (char) (Integer.parseInt(matcher.group(2)) + 'a' - 1);
        }
        stringBuffer.append(decryptChar);
    }
    return stringBuffer.toString();
}


