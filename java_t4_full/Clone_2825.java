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
    StringBuilder result = new StringBuilder();
    IntStream.range(0, str.length())
    .forEach(i -> {
        int count = (int)str.chars().filter(ch -> ch == str.charAt(i)).count();
        result.append(str.charAt(i)).append(count);
        str = str.replace(String.valueOf(str.charAt(i)), "");
        i=0;
    });
    return result.toString();
}


