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
    int currentGap = 0;
    while (N != 0 && N % 2 == 0) {
        N /= 2;
    }
    while (N != 0) {
        if (N % 2 == 0) {
            currentGap++;
        } else {
            maxGap = Math.max(currentGap, maxGap);
            currentGap = 0;
        }
        N /= 2;
    }
    return maxGap;
}


