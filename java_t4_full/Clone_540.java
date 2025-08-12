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
    int size = 0;
    for (char digit : binaryString.toCharArray()){
        if (digit == '0'){
            size++;
            value = Math.max (size,value);
        }
        else{
            size = 0;
        }
    }
    return value;
}


