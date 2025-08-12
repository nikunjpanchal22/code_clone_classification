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


 private static int solution (int N) {
    int maxGap = 0;
    String binaryStr = Integer.toBinaryString (N);
    StringBuffer zerosStr = new StringBuffer();
    int lenOfStr = binaryStr.length ();
    for (int i = 0; i < lenOfStr; i++) {
        char currChar = binaryStr.charAt (i);
        if (currChar == '1') {
            int zerosLen = zerosStr.length();
            if (zerosLen > 0) {
                maxGap = Math.max (zerosLen, maxGap);
            }
            zerosStr = new StringBuffer();
        }
        else if (currChar == '0') {
            zerosStr.append ('0');
        }
    }
    return maxGap;
}


