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
    String binaryString= Integer.toString (number, 2);
    int value = 0;
    int currentCount = 0; 
    for (int i=0; i<binaryString.length (); i++) {
            if (binaryString.charAt (i) == '1') {
                if (currentCount > value) {
                    value = currentCount; 
                } 
                currentCount = 0; 
            } else {
                currentCount++;
            }
    }
    return value; 
}


