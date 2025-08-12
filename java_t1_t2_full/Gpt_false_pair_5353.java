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
    String [] holes = binary.split ("1");
    String largestHole = "";
    for (int i = 0; 
    i < (binary.endsWith ("1") ? holes.length : holes.length - 1); i ++) {
        if (holes [i].contains ("0") && holes [i].length () > largestHole.length ()) largestHole = holes [i];
    }
    return largestHole.length ();
}
