public static int [] front11 (int [] a, int [] b) {
    int alen = (a != null) ? a.length : 0, blen = (b != null) ? b.length : 0;
    if (alen > 0 && blen > 0) {
        return new int [] {a [0], b [0]};
    } else if (alen > 0) {
        return new int [] {a [0]};
    } else if (blen > 0) {
        return new int [] {b [0]};
    } else {
        return new int [0];
    }
}



 

public static int[] front11(int[] a, int[] b) {
    return (a != null && a.length > 0 && b != null && b.length > 0) ? new int[]{a[0], b[0]} :
            (a != null && a.length > 0) ? new int[]{a[0]} :
            (b != null && b.length > 0) ? new int[]{b[0]} : new int[0];
}


