public static String join (String delimiter, String...inStr) {
    StringBuilder sb = new StringBuilder ();
    if (inStr.length > 0) {
        sb.append (inStr [0]);
        for (int i = 1;
        i < inStr.length; i ++) {
            sb.append (delimiter);
            sb.append (inStr [i]);
        }
    }
    return sb.toString ();
}


 public static String join(String delimiter, String... inStr) {
    String result = "";
    for(int i = 0; i < inStr.length; i++) {
        if(i > 0) {
            nextString = delimiter + inStr[i];
        } else {
            nextString = inStr[i];
        }
        result = result + nextString;
    }
    return result;
}


