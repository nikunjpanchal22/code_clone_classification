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
    String result = "";
    for (String value : input)
        result += delimiter + value;
    return input.length > 0 ? result.substring(delimiter.length()) : result;
}


