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
    int gap = 0, gapCounter = 0;
    boolean counting = false;
    while (N > 0){
        if ((N & 1) == 1){
            gap = Math.max(gap, gapCounter);
            gapCounter = 0;
            counting = true;
        } else if (counting) {
            gapCounter++;
        }
        N >>= 1;
    }
    return gap;
}


