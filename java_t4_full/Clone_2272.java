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


  private static String join(String delimiter, String... parts) {

    if(parts == null || parts.length == 0) {
        return "";
    }

    String[] filteredParts = Arrays.stream(parts)
            .filter(s -> !isEmpty(s))
            .toArray(String[]::new);

    
    if (filteredParts.length == 0) {
        return "";
    }

    StringJoiner joiner = new StringJoiner(delimiter);
    Arrays.stream(filteredParts).forEach(joiner::add);

    return joiner.toString();
}


