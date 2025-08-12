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
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < input.length; i++) {
        sb = i < input.length - 1 ? sb.append(input[i]).append(delimiter) : sb.append(input[i]);
    }
    return sb.toString();
}


