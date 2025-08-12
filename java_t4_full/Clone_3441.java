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





private static int solution(int N) {
    int gap = 0;
    String[] frags = Integer.toBinaryString(N).split("1+");

    for (int i = 0; i < frags.length() - 1; i++) {
        gap = Math.max(gap, frags[i].length());
    }
    return gap;
}


