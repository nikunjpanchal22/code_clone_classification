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
    int largestGap = 0;
    for (int index = 0, gap = 0;
    index < binaryStr.length (); index ++) {
        while (index < binaryStr.length () && binaryStr.charAt (index) == '0') {
            gap ++;
            index ++;
        }
        if (gap > largestGap && index < binaryStr.length ()) {
            largestGap = gap;
        }
        gap = 0;
    }
    return largestGap;
}
