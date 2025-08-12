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
    if (str == null || str.isEmpty()) return "";
    StringBuilder sb = new StringBuilder();
    char[] chars = str.toCharArray();
    int count = 1;
    for (int i = 1; i < chars.length; i++) {
        if (chars[i] != chars[i - 1]) {
            sb.append(chars[i - 1]).append(count);
            count = 1;
        } else {
            count++;
        }
    }
    sb.append(chars[chars.length - 1]).append(count);
    return sb.toString();
}


