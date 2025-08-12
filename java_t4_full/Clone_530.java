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
    String binaryStr = Integer.toBinaryString(N);
    char[] ch = binaryStr.toCharArray();
    int currentCount = 0; 
    int maxCount = 0;
    for (char c : ch) {
        if (c == '1') {
            maxCount = Math.max(maxCount, currentCount);
            currentCount = 0;
        } 
        else {
            currentCount++;
        }
    }
    gap = Math.max(maxCount, currentCount);
    return gap;
}


