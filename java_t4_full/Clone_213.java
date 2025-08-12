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
        if (str.charAt(i) == str.charAt(i + 1)) {
            countConsecutive++;
            if (i == str.length() - 2) {
                compressedString.append(currentChar).append(countConsecutive);
            }
        } else {
            compressedString.append(currentChar).append(countConsecutive);
            countConsecutive = 1;
            if (i == (str.length() - 2)) {
                compressedString.append(str.charAt(i + 1)).append(1);
            }
        }
    }
    return compressedString.toString();
}


