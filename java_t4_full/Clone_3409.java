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



private static int solution(int N){
    int maxGap = 0;
    int currentGap = 0;
    boolean counting = false;
    while(N > 0){
        if((N & 1) == 0){
            if(counting){
                currentGap++;
            }
        }else {
            if(counting){
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0;
            }else {
                counting = true;
            }
        }
        N = N >>> 1;
    }
    return maxGap;
}


