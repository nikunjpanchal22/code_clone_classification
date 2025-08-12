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
    int gap = 0;
    BitSet bitSet = BitSet.valueOf(new long[]{N});

    for (int i = 0, j; i < bitSet.length(); i++) {
        if (!bitSet.get(i)) {
            for (j = i+1; j < bitSet.length() && !bitSet.get(j); j++) {}

            gap = Math.max(gap, j - i);
            i = j-1;
        }
    }
    return gap;
}


