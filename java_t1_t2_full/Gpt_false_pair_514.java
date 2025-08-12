public int solution (int N) {
    String binary = Integer.toString (N, 2);
    int largestGap = 0;
    for (int i = 1, gap = 0;
    i < binary.length (); i ++) {
        while (i < binary.length () && binary.charAt (i) == '0') {
            i ++;
            gap ++;
        }
        if (gap > largestGap && i < binary.length ()) {
            largestGap = gap;
        }
        gap = 0;
    }
    return largestGap;
}


 
public int solution (int N) {
    String binaryStr = Integer.toString (N, 2);
    int maxGap = 0;
    for (int i = 0; i < binaryStr.length (); i ++) {
        int currGap = 0;
        while (i < binaryStr.length () && binaryStr.charAt (i) == '0') {
            i ++;
            currGap ++;
        }
        if (currGap > maxGap && i < binaryStr.length ()) {
            maxGap = currGap;
        }
        currGap = 0;
    }
    return maxGap;
}
