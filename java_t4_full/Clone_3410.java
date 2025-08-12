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
    int currentGap = 0;
    int maxGap = 0;
    boolean isGap = false;
    while (N > 0) {
        if (N % 2 == 0) {
            if (isGap) {
                currentGap++;
            }
        } else {
            maxGap = currentGap > maxGap ? currentGap : maxGap;
            currentGap = 0;
            isGap = true;
        }
        N = N / 2;
    }
    return maxGap;
}


