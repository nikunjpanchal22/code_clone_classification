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
    int length = 0;
    while (N > 0) {
        if ((N & 1) == 0)
            length++;
        else {
            gap = Math.max(gap, length);
            length = 0;
        }
        N >>= 1;
    }
    return gap;
}


