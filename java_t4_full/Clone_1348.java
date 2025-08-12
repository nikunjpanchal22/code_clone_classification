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
    StringJoiner stringJoiner = new StringJoiner(delimiter);
    for (String str : inStr) {
        stringJoiner.add(str);
    }
    return stringJoiner.toString();
}


