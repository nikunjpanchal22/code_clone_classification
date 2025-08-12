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
    String binaryStr = Integer.toBinaryString (N);
    int lenOfStr = binaryStr.length ();
    for (int i = 0; i < lenOfStr; i++) {
        char currChar = binaryStr.charAt (i);
        if (currChar == '0') {
            int zerosLen = binaryStr.indexOf ('1', i) - i;
            if (zerosLen > 0) {
                maxGap = Math.max (zerosLen, maxGap);
            }
        }
    }
    return maxGap;
}


