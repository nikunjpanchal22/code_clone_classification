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
    String message = "";
    String[] split_msg = msg.split("(#)|(\\d\\d)");
    for (int i = 0; i < split_msg.length; i++) {
        if (split_msg[i] != "") {
            char c = (char) (Integer.parseInt(split_msg[i]) + 'a' - 1);
            message += c;
        }
    }
    return message;
}


