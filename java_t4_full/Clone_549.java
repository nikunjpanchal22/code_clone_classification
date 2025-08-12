private static int solution (int N) {
    int gap = 0;
    String binaryStr = Integer.toBinaryString (N);
    String [] zeroArrays = binaryStr.split ("1");
    System.out.println (Arrays.toString (zeroArrays));
    for (String zeroArray : zeroArrays) {
        gap = zeroArray.length () > gap ? zeroArray.length () : gap;
    }
    return gap;
}


 private static int solution (int N) {
    int maxGap = 0;
    char [] binaryChars = Integer.toBinaryString (N).toCharArray(); 
    int lenOfStr = binaryChars.length;
    int currGap = 0;
    for (int i = 0; i < lenOfStr; i++) {
        char currChar = binaryChars[i];
        if (currChar == '0') {
            currGap++;
        }
        else {
            maxGap = Math.max (currGap, maxGap);
            currGap = 0; 
        }
    }
    return maxGap;
}


