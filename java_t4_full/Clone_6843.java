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



private static String join(String delimiter, String...parts) {
    java.util.StringJoiner joiner = new java.util.StringJoiner(delimiter);
    for (String part : parts) {
        if (! part.isEmpty ()) {
            joiner.add(part);
        }
    }
    return joiner.toString();
}


