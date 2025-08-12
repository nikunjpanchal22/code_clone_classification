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




public static String compressBad(String str) {
    String compressedString = "";
    for(int i = 0; i < str.length(); i++) {
        int count = 1;
        while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {
            i++;
            count++;
        }
        compressedString += str.charAt(i) + String.valueOf(count);
    }
    return compressedString;
}


