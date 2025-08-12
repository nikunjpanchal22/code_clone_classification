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
    String binaryString = Integer.toString (N, 2);
    int largestGap = 0;
    
    for (int i = 1, gap = 0; i < binaryString.length (); i ++) {
        if (binaryString.charAt (i) == '0') {
            gap ++;
        } else {
            if (gap > largestGap) {
                largestGap = gap;
            }
            gap = 0;
        }
    }
    return largestGap;
}


