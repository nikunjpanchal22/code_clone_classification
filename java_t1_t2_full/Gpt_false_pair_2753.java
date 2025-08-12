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
    StringBuilder result = new StringBuilder();
    for(String part : parts) {
        if(!isEmpty(part)) {
            if(result.length() > 0) {
                result.append(delimiter);
            }
            result.append(part);
        }
    }
    return result.toString();
}
