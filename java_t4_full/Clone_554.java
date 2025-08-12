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
    int oneIndex = binaryStr.indexOf ('1');
    while (oneIndex != -1) {
        int zerosLen = oneIndex - 1;
        if (zerosLen > 0) {
            maxGap = Math.max (zerosLen, maxGap);
        }
        oneIndex = binaryStr.indexOf ('1', oneIndex + 1);
    }
    return maxGap;
}


