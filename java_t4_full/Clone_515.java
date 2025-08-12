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
    String binary = Integer.toBinaryString (number);
    List<Integer> binaryList = new ArrayList<>();
    for (int i = 0; i < binary.length(); i ++) {
        if (binary.charAt(i) == '1') {
            binaryList.add(1);
        } else {
            binaryList.add(0);
        }
    }
    int biggestGap = 0;
    int gapLength = 0;
    for (int i = 0; i < binaryList.size(); i++) {
        if (binaryList.get(i) == 0) {
            gapLength++;
        } else {
            if (gapLength > biggestGap) {
                biggestGap = gapLength;
            }
            gapLength = 0;
        }
    }
    return biggestGap;
}


