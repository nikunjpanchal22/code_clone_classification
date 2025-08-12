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
    StringBuilder result = new StringBuilder();
    for (String s : input) {
        result.append(s).append(delimiter);
    }
    return result.substring(0, result.length() - delimiter.length());
}


