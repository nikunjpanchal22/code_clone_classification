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
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '\n') {
            lines++;
        }
    }
    return lines;
}


