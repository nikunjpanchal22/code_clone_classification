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
    Pattern pattern = Pattern.compile("(\\d(\\d#)?)");
    Matcher matcher = pattern.matcher(msg);
    StringBuilder decryptedMessage = new StringBuilder();
    while (matcher.find()) {
        String matchedString = matcher.group(0);
        String substring;
        if (matchedString.length() == 3) {
            substring = matchedString.substring(0,2);
        } else {
            substring = matchedString.substring(0,1);
        }
        char decryptionChar = (char) (Integer.parseInt(substring) + 'a' - 1);
        decryptedMessage.append(decryptionChar);
    }
    return decryptedMessage.toString();
}


