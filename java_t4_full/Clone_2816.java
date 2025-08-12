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
    if(str == null || str.isEmpty()) return str;
    String compressedString = "";
    int counter = 1;
    for(int i = 1; i < str.length(); i++) {
        if(str.charAt(i-1) == str.charAt(i))
            counter++;
        else {
            compressedString += str.charAt(i-1) + Integer.toString(counter);
            counter = 1;
        }
    }
    return compressedString;
}


