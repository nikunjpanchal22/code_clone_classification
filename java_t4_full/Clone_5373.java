private String join (String [] input, String delimiter) {
    StringBuilder sb = new StringBuilder ();
    for (String value : input) {
        sb.append (value);
        sb.append (delimiter);
    }
    int length = sb.length ();
    if (length > 0) {
        sb.setLength (length - delimiter.length ());
    }
    return sb.toString ();
}





private String join(String[] input, String delimiter) {
    java.util.StringJoiner joiner = new java.util.StringJoiner(delimiter);
    for (String s : input) {
        joiner.add(s);
    }
    return joiner.toString();
}


