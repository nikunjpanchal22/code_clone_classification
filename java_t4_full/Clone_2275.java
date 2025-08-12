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
    Optional<String> joinedString = Arrays.stream(parts)
        .filter(part -> ! isEmpty(part))
        .collect(Collectors.joining(delimiter));
    return joinedString.orElse('');
}


