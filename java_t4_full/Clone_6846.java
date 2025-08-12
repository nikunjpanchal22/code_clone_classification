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
    java.util.Arrays.stream(parts)
            .filter(part -> !part.isEmpty())
            .reduce((a, b) -> a + delimiter + b)
            .ifPresent(builder::append);
    return builder.toString();
}


