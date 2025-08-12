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
    for (int i = 0; i < input.length - 1; i++) {
        result += input[i] + delimiter;
    }
    if (input.length > 0) {
        result += input[input.length - 1];
    }
    return result;
}


