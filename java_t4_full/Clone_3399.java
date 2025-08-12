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
    int gapLength = 0;
    int maxGap = 0;
    boolean foundOne = false;
    int n = number;

    while (n > 0) {
        if (n % 2 == 0) {
            if (foundOne) {
                gapLength++;
            }
        } else {
            foundOne = true;
            if (gapLength != 0) {
                maxGap = Math.max(maxGap, gapLength);
                gapLength = 0;
            }
        }
        n /= 2;
    }

    return maxGap;
}


