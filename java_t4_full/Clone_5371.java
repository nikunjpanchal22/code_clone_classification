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
    if (input.length == 0)
        return "";
    StringBuilder sb = new StringBuilder(input[0]);
    for (int i = 1; i < input.length; i++)
        sb.append(delimiter).append(input[i]);
    return sb.toString();
}


