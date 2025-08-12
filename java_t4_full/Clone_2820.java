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
    StringBuilder builder = new StringBuilder();
    int [] count = new int[256];
    for(char c : str.toCharArray()){
        count[c]++;
    }
    for(int i=0; i<count.length; i++){
        if(count[i] != 0){
            builder.append((char)i).append(count[i]);
        }
    }
    return builder.toString();
}


