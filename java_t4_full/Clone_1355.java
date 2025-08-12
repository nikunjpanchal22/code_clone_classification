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
    int i;
    for (i = 0; i < input.length - 1; i++) {
        sb.append (input[i] + delimiter);
    }
    sb.append(input[i]);
    return sb.toString ();
}


