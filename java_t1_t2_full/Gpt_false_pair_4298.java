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


private static int solution (int N) {
    int gap = 0;
    String binaryStr = Integer.toBinaryString (N);
    String [] oneArrays = binaryStr.split ("0");
    System.out.println (Arrays.toString (oneArrays));
    for (String oneArray : oneArrays) {
        gap = oneArray.length () > gap ? oneArray.length () : gap;
    }
    return gap;
}
