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
    String binaryStr = Integer.toBinaryString(N);
    char[] charArray = binaryStr.toCharArray();
    int currentCount = 0;
    for(int i = 0; i < charArray.length; i++){
        if(charArray[i] == '0'){
            currentCount+= 1;
            gap = Math.max(gap, currentCount);
        }
        else{
            currentCount = 0;
        }
    }
    return gap;
}


