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
    Integer[] binary = Integer.toBinaryString(N)
                              .chars()
                              .map(c -> c - '0')
                              .toArray(Integer[]::new);

    for (int i = 0, j; i < binary.length; i++) {
        if (binary[i] == 0) {
            for (j = i+1; j < binary.length && binary[j] == 0; j++) {}

            gap = Math.max(gap, j - i);
            i = j-1;
        }
    }
    return gap;
}


