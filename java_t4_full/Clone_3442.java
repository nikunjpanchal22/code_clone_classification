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
    if(N==0) return 0;

    int gap = 0;
    Integer[] zeroLength = Arrays.stream(Integer.toBinaryString(N).split("1"))
                                 .map(String::length)
                                 .toArray(Integer[]::new);

    for(int i=0; i<zeroLength.length-1; i++)
        gap = Math.max(gap, zeroLength[i]);

    return gap;
}


