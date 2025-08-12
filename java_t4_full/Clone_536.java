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
    String binary = Integer.toBinaryString(number);
    int [] gaps= new int [binary.length ()];
    int maxGap= 0;
    int count = 0;
    for (char digit : binary.toCharArray ()){
        if (digit == '0') {
            count++;
            if (count > maxGap) {
                maxGap= count;
            }
        } else {
            count= 0;
        }
    }
    return maxGap;
}


