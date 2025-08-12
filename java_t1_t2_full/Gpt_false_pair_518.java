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
    int bNum = Integer.parseInt (Integer.toString (N, 2));
    int largestGap = 0;
    for (int pos = 1, gap = 0;
    pos < bNum.length (); pos ++) {
        while (pos < bNum.length () && bNum.charAt (pos) == '0') {
            pos ++;
            gap ++;
        }
        if (gap > largestGap && pos < bNum.length ()) {
            largestGap = gap;
        }
        gap = 0;
    }
    return largestGap;
}
