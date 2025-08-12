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
    int prevIndex = -1;
    int nextIndex = binaryStr.indexOf ('1'); 
    while (nextIndex != -1) {
        int zerosLen = nextIndex - prevIndex - 1;
        if (zerosLen > 0) {
            maxGap = Math.max (zerosLen, maxGap);
        }
        prevIndex = nextIndex;
        nextIndex = binaryStr.indexOf ('1', nextIndex + 1);
    }
    return maxGap;
}


