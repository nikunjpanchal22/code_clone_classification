public static String join (String separator, String...values) {
    if (values.length == 0) return "";
    char [] sep = separator.toCharArray ();
    int totalSize = (values.length - 1) * sep.length;
    for (int i = 0;
    i < values.length; i ++) {
        if (values [i] == null) values [i] = "";
        else totalSize += values [i].length ();
    }
    char [] joined = new char [totalSize];
    int pos = 0;
    for (int i = 0, end = values.length - 1;
    i < end; i ++) {
        System.arraycopy (values [i].toCharArray (), 0, joined, pos, values [i].length ());
        pos += values [i].length ();
        System.arraycopy (sep, 0, joined, pos, sep.length);
        pos += sep.length;
    }
    System.arraycopy (values [values.length - 1].toCharArray (), 0, joined, pos, values [values.length - 1].length ());
    return new String (joined);
}


 public static String join(String delimiter, String... values) {
    
    if (values.length == 0) return "";
    int totalSize = (values.length - 1) * delimiter.length();
    for (int i = 0; i < values.length; i++) {
        if (values[i] == null) values[i] = "";
        else totalSize += values[i].length();
    }
    StringBuilder joined = new StringBuilder(totalSize);
    for (int i = 0; i < values.length - 1; i++) {
        joined.append(values[i]);
        joined.append(delimiter);
    }
    joined.append(values[values.length - 1]);
    return joined.toString();
}


