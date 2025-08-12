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
    int max_zero = 0;
    int count = 0;
    String binary = Integer.toBinaryString(N);
    for (int i = 0; i < binary.length(); i++) {
        if (binary.charAt(i) == '0') {
            count++;
            max_zero = Math.max(max_zero, count);
        } else {
            count = 0;
        }
    }
    return max_zero;
}


