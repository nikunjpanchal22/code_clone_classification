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
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < str.length();) {
        char c = str.charAt(i);
        int j = i;
        while(j < str.length() && str.charAt(j) == c) {
            j++;
        }
        result.append(c).append(j - i);
        i = j;
    }
    return result.toString();
}


