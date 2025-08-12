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
    String binNumber = Integer.toString (N, 2);
    int largestGap = 0;
 
    for (int i = 0; i < binNumber.length ()-1; i++) {
        int gap =0;
        if (binNumber.charAt(i) == '0' && binNumber.charAt(i+1) == '0') {
            gap ++;
            while (i < binNumber.length ()-1 && binNumber.charAt (i+1) == '0') {
                gap ++;
                i ++;
            }
            if (gap > largestGap) {
                largestGap = gap;
            }
        }
    }
    return largestGap;
}


