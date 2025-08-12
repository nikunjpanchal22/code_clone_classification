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
    int maxGap = 0;
    String binaryStr = Integer.toBinaryString (N);
    int len = binaryStr.length();
    int digitCount = 0; 
    for( int i = 0; i < len ;i++) {
        if (binaryStr.charAt(i) == '1') {
            maxGap = Math.max(maxGap, digitCount);
            digitCount = 0; 
        } else
            digitCount++; 
    }
    return maxGap;
}


