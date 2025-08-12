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


public static String toJavaMethodName (final String nonJavaMethodName) {
    final StringBuilder nameBuilder = new StringBuilder ();
    boolean capitalizeNextChar = false;
    boolean first = true;
    for (int i = 0; i < nonJavaMethodName.length (); i ++) {
        final char c = nonJavaMethodName.charAt (i);
        if (Character.isLetterOrDigit (c) != true) {
            capitalizeNextChar = (! first);
        } else {
            nameBuilder.append (capitalizeNextChar ? Character.toUpperCase (c) : Character.toLowerCase (c));
            capitalizeNextChar = false;
            first = false;
        }
    }
    return nameBuilder.toString ();
}
