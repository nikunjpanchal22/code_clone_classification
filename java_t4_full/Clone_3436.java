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
    char[] binaryRep = Integer.toBinaryString(N).toCharArray();

    for (int i = 0, j; i < binaryRep.length; i++) {
        if (binaryRep[i] == '0') {
            for (j = i+1; j < binaryRep.length && binaryRep[j] == '0'; j++) {}

            gap = Math.max(gap, j - i);
            i = j-1;
        }
    }
    return gap;
}


