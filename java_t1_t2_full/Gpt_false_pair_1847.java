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


 public static String jNameify (final String nonJName) {
    final StringBuilder nameBuilder = new StringBuilder ();
    boolean capitalizeNextChar = false;
    boolean first = true;
    for (int i = 0;
    i < nonJName.length (); i ++) {
        final char c = nonJName.charAt (i);
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
