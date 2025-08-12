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
    java.util.Arrays.asList(parts)
            .stream()
            .filter(part -> !part.isEmpty())
            .forEach(part -> builder.append(part).append(delimiter));
    return builder.toString();
}


