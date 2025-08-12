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
    String longestGap = "";
    String currentGap = "";
    for (int i = 0; i < binary.length(); i++) {
        if (binary.charAt(i) == '1') {
            if (longestGap.length() < currentGap.length()) {
                longestGap = currentGap;
            }
            currentGap = "";
        }
        else {
            currentGap += "0";
        }
    }
    return longestGap.length();
}


