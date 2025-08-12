public static String compressBad (String str) {
    int countConsecutive = 0;
    String compressedString = "";
    for (int i = 0;
    i < str.length (); i ++) {
        countConsecutive ++;
        if (str.length () == (i + 1)) {
            compressedString += "" + str.charAt (i) + countConsecutive;
            countConsecutive = 0;
            break;
        } else if (str.charAt (i) != str.charAt (i + 1)) {
            compressedString += "" + str.charAt (i) + countConsecutive;
            countConsecutive = 0;
        }
    }
    return compressedString;
}




public static String compressBad(String str) {
    int countConsecutive = 0;
    String compressedString = "";
    int i = 0;
    while (i < str.length()) {
        countConsecutive++;
        if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
            compressedString += str.charAt(i) + countConsecutive;
            countConsecutive = 0;
        }
        i++;
    }
    return compressedString;
}


