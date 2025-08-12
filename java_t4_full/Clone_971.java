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
    char[] split_msg = msg.toCharArray();
    for (int i = 0; i < split_msg.length; i++) {
        int character = 0;
        if (split_msg[i] == '#') {
            character = Integer.parseInt(split_msg[i - 2] + "" + split_msg[i - 1]) - 1 + 'a';
        } else if (split_msg[i] >= '0' && split_msg[i] <= '9') {
            character = (split_msg[i] - '0') + 'a' - 1;
        }

        if (character > 0) {
            message += (char) character;
        }
    }
    return message;
}


