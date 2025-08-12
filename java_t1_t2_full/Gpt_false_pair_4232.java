public static String toJavaMethodName (final String nonJavaMethodName) {
    final StringBuilder nameBuilder = new StringBuilder ();
    boolean capitalizeNextChar = false;
    boolean first = true;
    for (int i = 0;
    i < nonJavaMethodName.length (); i ++) {
        final char c = nonJavaMethodName.charAt (i);
        if (! Character.isLetterOrDigit (c)) {
            if (! first) {
                capitalizeNextChar = true;
            }
        } else {
            nameBuilder.append (capitalizeNextChar ? Character.toUpperCase (c) : Character.toLowerCase (c));
            capitalizeNextChar = false;
            first = false;
        }
    }
    return nameBuilder.toString ();
}


public static String toJavaMethodName (final String nonStandardName) {
    final StringBuilder nameBuilder = new StringBuilder ();
    boolean switchCase = false;
    boolean first = true;
    for (int i = 0;
    i < nonStandardName.length (); i ++) {
        final char c = nonStandardName.charAt (i);
        if (! Character.isLetterOrDigit (c)) {
            if (! first) {
                switchCase = true;
            }
        } else {
            nameBuilder.append (switchCase ? Character.toUpperCase (c) : Character.toLowerCase (c));
            switchCase = false;
            first = false;
        }
    }
    return nameBuilder.toString ();
}
