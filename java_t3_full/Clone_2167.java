private static String join (String delimiter, String...parts) {
    StringBuilder builder = new StringBuilder ();
    for (String part : parts) {
        if (! isEmpty (part)) {
            if (builder.length () > 0) {
                builder.append (delimiter);
            }
            builder.append (part);
        }
    }
    return builder.toString ();
}


  private static String join (String delimiter, String...parts) {
    StringJoiner joiner = new StringJoiner(delimiter);
    for (String part : parts) {
        if (! isEmpty (part)) {
            joiner.add (part);
        }
    }
    return joiner.toString();
}


