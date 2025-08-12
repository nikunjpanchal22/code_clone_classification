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
    int count = 0;
    char[] binary = Integer.toBinaryString(N).toCharArray();
    for (char b : binary) {
        if (b =='0') {
            count++;
        } else {
            gap = count > gap ? count : gap;
            count = 0;
        }
    }
    return gap;
}


