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


 public static String joinStrings (String separator, String...values) {
    if (values.length == 0) return ""; 
    String joined = values[0];
    int totalSize = joined.length();
    for (int i = 1; i < values.length; i++) {
        joined += separator + values[i];
        if (values[i] != null)
          totalSize += values[i].length();
    }
    if (totalSize != joined.length()) {
        char[] joinedArr = new char[totalSize];
        int pos = 0;
        for (int i = 0, end = values.length - 1; i < end; i++) {
            for (int y = 0; y < values[i].length(); y++) {
                joinedArr[pos + y] = values[i].charAt(y);
            }
            pos += values[i].length();
            for (int z = 0; z < separator.length(); z++) {
                joinedArr[pos + z] = separator.charAt(z);
            }
            pos += separator.length();
            for (int x = 0; x < values[i].length(); x++) {
                joinedArr[pos + x] = values[i].charAt(x);
            }
        }
        joined = new String(joinedArr);
    }
    return joined;
}


