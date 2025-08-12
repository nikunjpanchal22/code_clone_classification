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




public static String compressBad (String str){
    StringBuilder sb = new StringBuilder();
    if(str != null && !str.isEmpty()) {
        char ch = str.charAt(0);
        int count = 1;
        for(int i = 1; i < str.length(); i++) {
            if(ch == str.charAt(i)){
                count++;
            } else {
                sb.append(ch).append(count);
                count = 1;
                ch = str.charAt(i);
            }
        }
        sb.append(ch).append(count);
    }
    return sb.toString();
}


