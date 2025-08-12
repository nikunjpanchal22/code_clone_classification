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
        if (str.isEmpty()) return str;
        else return compressRec(str, 1, str.charAt(0), "");
    }

    private static String compressRec(String str, int count, char lastChar, String result) {
        if (str.isEmpty()) return result + lastChar + count;
        else if (str.charAt(0) == lastChar) return compressRec(str.substring(1), count + 1, lastChar, result);
        else return compressRec(str.substring(1), 1, str.charAt(0), result + lastChar + count);
}


