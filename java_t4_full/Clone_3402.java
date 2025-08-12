public static int solution (Integer number) {
    String binary = Integer.toBinaryString (number);
    String [] gaps = binary.split ("1");
    String biggestGap = "";
    for (int i = 0;
    i < (binary.endsWith ("1") ? gaps.length : gaps.length - 1); i ++) {
        if (gaps [i].contains ("0") && gaps [i].length () > biggestGap.length ()) biggestGap = gaps [i];
    }
    return biggestGap.length ();
}




public static int solution(Integer number) {
    int maxGap = 0;
    int gapCount = -1;
    int mask = 1;

    while (number > 0) {
        if ((number & mask) == 0) {
            if (gapCount >= 0) {
                gapCount++;
            }
        } else {
            maxGap = Math.max(maxGap, gapCount);
            gapCount = 0;
        }
        number>>>=1;
    }

    return maxGap;
}


