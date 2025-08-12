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
    String[] zeros = Integer.toBinaryString(N).split("1");
    int gap = 0;
    for (String zero : zeros) {
        gap = Math.max(gap, zero.length());
    }
    return gap;
}


