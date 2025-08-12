public int solution (int N) {
    int result = 0;
    while (N > 0) {
        if ((N & 1) == 1) {
            int temp = 0;
            while ((N>>= 1) > 0 && ((N & 1) != 1)) {
                temp ++;
            }
            result = Math.max (result, temp);
        } else {
            N>>= 1;
        }
    }
    return result;
}





public int solution(int N) {
    int result = 0;
    String bitString = Integer.toBinaryString(N);
    String[] gapArray = bitString.split("1");
    for (int i = 0; i < gapArray.length; i++) {
        int gapLength = gapArray[i].length();
        if (gapLength > result) {
            result = gapLength;
        }
    }
    return result;
}


