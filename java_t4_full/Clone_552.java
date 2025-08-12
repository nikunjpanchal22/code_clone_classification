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
    int startIndex = 0;
    while (startIndex < lenOfStr) {
        int endIndex = binaryStr.indexOf ('1', startIndex);
        int zerosLen = endIndex - startIndex;
        if (zerosLen > 0) {
            maxGap = Math.max (zerosLen, maxGap); 
        }
        startIndex = endIndex + 1; 
    }
    return maxGap;
}


