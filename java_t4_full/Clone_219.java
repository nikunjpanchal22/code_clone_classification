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
    StringBuilder compressedString = new StringBuilder();
    int countConsecutive = 1;
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) == str.charAt(i + 1)) {
            countConsecutive++;
        } else {
            compressedString.append(str.charAt(i)).append(countConsecutive);
            countConsecutive = 1;
        }
    }
    compressedString.append(str.charAt(str.length() - 1)).append(countConsecutive);
    return compressedString.toString();
}


