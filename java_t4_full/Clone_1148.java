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
    int alen = a != null ? a.length : 0;
    int blen = b != null ? b.length : 0;
    int[] result = new int[2];
    if (alen > 0 && blen > 0) {
        result[0] = a[0];
        result[1] = b[0];
        return result;
    } else if (alen > 0) {
        result[0] = a[0];
        return result;
    } else if (blen > 0) {
        result[0] = b[0];
        return result;
    } else {
        return result;
    }
}


