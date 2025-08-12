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


 public static String joinElements (String separator, String...values) {
    if (values.length == 0) return ""; 
    char[] seperatorArr = separator.toCharArray();
    
    int totalSize = (values.length - 1) * seperatorArr.length;
    for (int i = 0; i < values.length; i++) {
        if (values[i] == null) values[i] = "";
        else totalSize += values[i].length();
    }

    char[] joined = new char[totalSize];
    int pos = 0;
    for (int i = 0, end = values.length - 1; i < end; i++) {
        for (int j = 0; j < values[i].length(); j++) {
            joined[pos] = values[i].charAt(j);
            pos++;
        }
        for (int k = 0; k < seperatorArr.length; k++) {
            joined[pos] = seperatorArr[k];
            pos++;
        }
    }
    for (int l = 0; l < values[values.length - 1].length(); l++) {
        joined[pos] = values[values.length - 1].charAt(l);
        pos++;
    }
    return new String(joined);
}


