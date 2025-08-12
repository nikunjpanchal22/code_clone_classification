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


 private String join (String [] input, String delimiter) {
    StringBuilder sb = new StringBuilder ();
    for (int i = 0; i < input.length -1; i++) {
        sb.append(input[i]);
        sb.append(delimiter);
    }
    sb.append(input[input.length-1]);
    int length = sb.length();
    if (length > 0) { 
        sb.setLength(length - delimiter.length());
    }
    return sb.toString();
}


