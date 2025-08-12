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
        for (int k = 1;
        k < str.length (); k ++) {
            if (str.charAt (k) == prevChar) {
                consecutiveCounter ++;
            }
            else {
                compressedString += String.valueOf (prevChar) + consecutiveCounter;
                prevChar = str.charAt (k);
                consecutiveCounter = 1;
            }
        }
        compressedString += String.valueOf (prevChar) + consecutiveCounter;
    }
    return compressedString;
}
