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
    char lastChar = str.charAt(str.length() - 1);
    StringBuilder compressed = new StringBuilder();
    int countConsecutive = 1;
    for (int i = 1; i < str.length ();i++) {
        if (str.charAt (i) == str.charAt (i - 1))
            countConsecutive++;
        else {
            compressed.append ( str.charAt (i - 1));
            compressed.append(countConsecutive);
            countConsecutive = 1;
        }
    } 
    compressed.append (lastChar);
    compressed.append (countConsecutive);
    return compressed.toString();
}


