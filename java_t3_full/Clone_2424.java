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
    StringBuilder compressedString = new StringBuilder();
    if (str != null && !str.isEmpty()) {
        int countConsecutive = 1;
        char prevChar = str.charAt (0);
        for (int i = 1; i < str.length (); i ++) {
            if (str.charAt (i) != prevChar) {
                compressedString.append(prevChar).append(countConsecutive);
                prevChar = str.charAt (i);
                countConsecutive = 1;
                continue;
            }
            countConsecutive ++;
        }
        compressedString.append(prevChar).append(countConsecutive);
    }
    return compressedString.toString();
}


