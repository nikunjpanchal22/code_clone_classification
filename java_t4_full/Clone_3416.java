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




 private static int solution(int N) {
    BitSet bs = BitSet.valueOf(new long[]{N});
    int lastSetBit = -1;
    int maxGap = 0;
    for (int i = bs.nextSetBit(0); i != -1; i = bs.nextSetBit(i+1)) {
        if (lastSetBit >= 0) {
            maxGap = Math.max(maxGap, i - lastSetBit - 1);
        }
        lastSetBit = i;
    }
    return maxGap;
}


