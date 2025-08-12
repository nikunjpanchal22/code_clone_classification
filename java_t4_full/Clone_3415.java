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
    int length;
    String[] zeroArray = Integer.toBinaryString(N).split("1");
    for (String s : zeroArray) {
        length = s.length();
        if (length > gap) {
            gap = length;
        }
    }
    return gap;
}


