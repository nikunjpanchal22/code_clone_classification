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
    int maxGap = 0;
    int currentGap = 0;
    boolean counting = false;

    for (char bit : Integer.toBinaryString(number).toCharArray()) {
        if (bit == '1') {
            if (currentGap != 0) {
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0;
            }
            counting = true;
        } else if (counting){
            currentGap++;
        }
    }
    return maxGap;
}


