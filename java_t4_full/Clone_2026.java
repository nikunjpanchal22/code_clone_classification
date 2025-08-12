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


 public static String joinArrayList (String separator, String...values) {
    if (values.length == 0) return ""; 
    LinkedList<Character> joinedList = new LinkedList<>();
    int totalSize = (values.length - 1) * separator.length();
    for (int i = 0; i < values.length; i++) {
        if (values[i] == null) values[i] = "";
        else totalSize += values[i].length();
    }
    int count = 0;
    for (int i = 0; i < values.length; i++) {
        for (int k = 0; k < values[i].length(); k++) {
            joinedList.add(values[i].charAt(k));
            count++;
        }
        if (i != values.length -1) {
            for (int l = 0; l < separator.length(); l++) {
                joinedList.add(separator.charAt(l));
                count++;
            }
        }
    }
    char[] joinedArr = new char[count];
    for (int p = 0; p < joinedList.size(); p++){
        joinedArr[p] = joinedList.get(p);
    }
    return new String(joinedArr);
}


