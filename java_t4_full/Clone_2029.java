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


 public static String joinBy (String separator, String... values) {
    if (values.length == 0) return ""; 
    int size = (values.length - 1) * separator.length();
    for (int i = 0; i < values.length; i++)
        size += values[i].length();
    char[] joined = new char[size];
    int count = 0;    
    for (int i = 0; i < values.length; i++){
        for (int j= 0; j < values[i].length(); j++)
            joined[count++] = values[i].charAt(j);
        if (i < values.length - 1)
            for (int j = 0; j < separator.length(); j++)
                joined[count++] = separator.charAt(j);
    }
    return new String(joined);
}


