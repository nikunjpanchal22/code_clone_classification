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


 public static String compressBad (String str) {
    char currentChar = 0;
    int countConsecutive = 1;
    StringBuilder compressedString = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        currentChar = str.charAt(i);
        if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            countConsecutive++;
        } else {
            compressedString.append(currentChar).append(countConsecutive);
            countConsecutive = 1;
        }
    }
    return compressedString.toString();
}


