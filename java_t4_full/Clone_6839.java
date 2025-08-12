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
    StringBuilder builder = new StringBuilder ();
    for (int i = 0; i < parts.length; i++) {
        if (! parts[i].isEmpty ()) {
            if (i > 0) builder.append (delimiter);
            builder.append(parts[i]);
        }
    }
    return builder.toString ();
}


