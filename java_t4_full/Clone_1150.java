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
    int lenA = a != null ? a.length : 0;
    int lenB = b != null ? b.length : 0;

    int len = lenA + lenB;
    int[] arr = new int[len];
    if (lenA > 0) {
        arr[0] = a[0];
    }
    if (lenB > 0) {
        arr[1] = b[0];
    }
    if (len == 0) {
        return new int[0];
    } else if (len == 1) {
        return Arrays.copyOfRange(arr, 0, 1);
    } else {
        return Arrays.copyOf(arr, 2);
    }
}


