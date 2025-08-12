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
    String compressedString = "";
    for (int i = 0, count = 1; i < str.length(); i++) {
        if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
            count++;
        } else {
            compressedString += String.format("%c%d", str.charAt(i), count);
            count = 1;
        }
    }
    return compressedString;
}


