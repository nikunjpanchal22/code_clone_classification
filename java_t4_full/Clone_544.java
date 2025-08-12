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
    String binary = Integer.toBinaryString(number);
    String[] gapsString = binary.split("1");
    int maxGap = 0;
    for (int i = 0; i < gapsString.length; i++) {
        if (binary.endsWith("1") == true && i == gapsString.length-1) break; 
        int gapLength = gapsString[i].length();
        if (gapLength > maxGap) maxGap = gapLength;
    }

    return maxGap;
}


