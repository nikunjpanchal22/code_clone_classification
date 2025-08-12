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


public static int solution (Integer num) {
    String binary = Integer.toBinaryString (num);
    String [] spaces = binary.split ("1");
    String bigSpace = "";
    for (int i = 0; 
    i < (binary.endsWith ("1") ? spaces.length : spaces.length - 1); i ++) {
        if (spaces [i].contains ("0") && spaces [i].length () > bigSpace.length ()) bigSpace = spaces [i];
    }
    return bigSpace.length ();
}
