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
    String binaryRepresentation = Integer.toString (N, 2);
    int largestGap = 0;
    
    for (int i = 1; i < binaryRepresentation.length (); i ++) {
        int gap = 0;
        while (i < binaryRepresentation.length () && binaryRepresentation.charAt (i) == '0') {
            gap ++;
            i ++;
        }
        if (gap > largestGap && i < binaryRepresentation.length ()) {
            largestGap = gap;
        }
    }
    return largestGap;
}
