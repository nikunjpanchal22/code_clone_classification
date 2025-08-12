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




public static int solution(Integer number) {
    String binary = Integer.toBinaryString(number);
    List<Integer> gapLengths = new ArrayList<>();
    
    for (String gap : binary.split("1")) {
        if (gap.contains("0")) {
            gapLengths.add(gap.length());
        }
    }
    
    return Collections.max(gapLengths);
}


