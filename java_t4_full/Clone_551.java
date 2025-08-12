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
    int currGap = 0;
    while (N > 0) { 
        int remainder = N % 2;
        if (remainder == 0) {
            currGap++; 
        }
        else {
            maxGap = Math.max (currGap, maxGap);
            currGap = 0; 
        }
        N = N / 2;
    }
    return maxGap;
}


