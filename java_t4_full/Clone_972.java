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
    int j = 0;
    for (int i = 0; i < msg.length(); i++, j++) {
        if (msg.charAt(i) == '#' && (i > 1 && i < msg.length())) {
            String period = msg.substring((i - 2), i);
            int key = Integer.parseInt(period) - 1 + 'a';
            message += (char) key;
        } else if (msg.charAt(i) >= '0' && msg.charAt(i) <= '9' && j < 2) {
            int key = (msg.charAt(i) - '0') + 'a' - 1;
            message += (char) key;
        }
    }

    return message;
}


