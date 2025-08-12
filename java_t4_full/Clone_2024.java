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


 public static String joinJoin (String separator, String...values) {
    if (values.length == 0) return "";
    String output = values[0];
    int totalSize = output.length();
    for (int i = 0; i < values.length; i++) {
        if (i != 0) {
            output += separator + values[i];
            totalSize += separator.length() + values[i].length();
        }
    }
    if (totalSize != output.length()) {
        char [] arr = new char [totalSize];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0 ;j < values[i].length(); j++) {
                arr[index] = values[i].charAt(j);
                index++;
            }
            if (i != values.length -1) {
                for (int k = 0; k < separator.length(); k++) {
                    arr[index] = separator.charAt(k);
                    index++;
                }
            }
        }
        output = new String(arr);
    }
    return output;
}


