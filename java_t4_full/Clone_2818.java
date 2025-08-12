public static String compressBad (String str) {
    String compressedString = "";
    if (str != null && str.length () > 0) {
        int countConsecutive = 1;
        char prevChar = str.charAt (0);
        for (int i = 1;
        i < str.length (); i ++) {
            if (str.charAt (i) != prevChar) {
                compressedString += String.valueOf (prevChar) + countConsecutive;
                prevChar = str.charAt (i);
                countConsecutive = 1;
                continue;
            }
            countConsecutive ++;
        }
        compressedString += String.valueOf (prevChar) + countConsecutive;
    }
    return compressedString;
}




public static String compressBad (String str) {
    if (str == null || str.isEmpty()) return str;
    StringBuffer output = new StringBuffer();
    int total = 0;
    for (int i = 0; i < str.length(); i++) {
        total++;
        if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
            output.append(str.charAt(i)).append(total);
            total = 0;
        }
    }
    return output.toString();
}


