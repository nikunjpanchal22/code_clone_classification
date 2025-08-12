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


 public static String compressBetter10(String str) {
    StringBuilder compressedStr = new StringBuilder();
    if (str != null && str.length() > 0) {
        int countConsecutive = 1;
        char prevChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == prevChar) {
                countConsecutive++;
            } else {
                compressedStr.append(String.valueOf(prevChar) + countConsecutive);
                prevChar = str.charAt(i);
                countConsecutive = 1;
            }
        }
        compressedStr.append(String.valueOf(prevChar) + countConsecutive);
    }
    return compressedStr.toString();
}


