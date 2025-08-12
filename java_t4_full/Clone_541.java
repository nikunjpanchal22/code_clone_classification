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
    //Convert number to binary
    String binaryString = Integer.toBinaryString (number);

    //Store maximum gap
    int maxGapLength = 0;
    
    //Iterate through binaryString to find max gap
    for (int i = 0; i < binaryString.length(); i++) {
        int currentGapLength = 0;
        //Count the length of current gap
        while (i < binaryString.length() && binaryString.charAt(i) == '0') {
            currentGapLength++;
            i++;
        }
        //Update maxGapLength if necessary
        maxGapLength = Math.max(maxGapLength, currentGapLength);
    }
    //Return maxGapLength
    return maxGapLength;
}


