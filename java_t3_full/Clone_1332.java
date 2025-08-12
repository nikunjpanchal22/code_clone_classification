public static int countLines (String str) {
    if (str == null || str.isEmpty ()) {
        return 0;
    }
    int lines = 1;
    int pos = 0;
    while ((pos = str.indexOf ("\n", pos) + 1) != 0) {
        lines ++;
    }
    return lines;
}


 public static int countLines (String str) {
    if (str == null || str.isEmpty ()) {
        return 0;
    }
    int lines = 0;
    int index = 0;
    while (index != -1) {
        index = str.indexOf('\n', index);
        if (index != -1) {
            lines++;
            index++;
            while (index < str.length() && str.charAt(index) == '\n') {
                index++;
            }
        }
    }
    return lines;
}


