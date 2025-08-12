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
    return Arrays.stream(input)
                    .reduce("", (acc,curr)-> acc + curr + delimiter)
                    .substring(0, input.length*delimiter.length() - delimiter.length());
}


