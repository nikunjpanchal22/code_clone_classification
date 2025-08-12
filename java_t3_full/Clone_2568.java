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
    String str = Integer.toBinaryString(N).replaceAll("0+$", "");
    String[] parts = str.split("1+");
    for(String part : parts) {
        gap = Math.max(gap, part.length());
    }
    return gap;
}


