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





public static int solution(int N) {
    String binary = Integer.toBinaryString(N);
    String[] zeros = binary.split("1");
    int length = 0;
    for(String zero : zeros)
        length = Math.max(length, zero.length());
    return length;
}


