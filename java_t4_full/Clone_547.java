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
    int oneIndex = -1;
    int i = 0;
    while (N > 0) { 
        int remainder = N % 2;
        if (remainder == 1) {
            if (oneIndex >= 0) {
                int zerosLen = oneIndex - 0;
                if (zerosLen > 0) {
                    maxGap = Math.max (zerosLen, maxGap);
                }
            }
            oneIndex = i;
        }
        i++;
        N = N / 2;
    }
    return maxGap;
} 


