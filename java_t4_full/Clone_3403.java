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




public static int solution (Integer number) {
    int trailingZeroes = Integer.numberOfTrailingZeros(number);
    number >>>= trailingZeroes;
    int currentGap = 0;
    int maxGap = 0;
    
    while (number > 0) {
        if ((number & 1) == 0) {
            currentGap++;
        } else {
            maxGap = Math.max(maxGap, currentGap);
            currentGap = 0;
        }
        number >>>= 1;
    }
    
    return maxGap;
}


