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
    if (str != null && str.length () > 0) {
        int consecutiveCounter = 1;
        char prevChar = str.charAt (0);
        for (int j = 1;
        j < str.length (); j ++) {
            if (str.charAt (j) != prevChar) {
                compressedString += String.valueOf (prevChar) + consecutiveCounter;
                prevChar = str.charAt (j);
                consecutiveCounter = 1;
            }
            else {
                consecutiveCounter ++;
            }
        }
        compressedString += String.valueOf (prevChar) + consecutiveCounter;
    }
    return compressedString;
}
