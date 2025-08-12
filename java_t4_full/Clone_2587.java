static void merge (int [] a, int [] l, int [] r) {
    int totElem = l.length + r.length;
    int i, li, ri;
    i = li = ri = 0;
    while (i < totElem) {
        if ((li < l.length) && (ri < r.length)) {
            if (l [li] < r [ri]) {
                a [i] = l [li];
                i ++;
                li ++;
            } else {
                a [i] = r [ri];
                i ++;
                ri ++;
            }
        } else {
            if (li >= l.length) {
                while (ri < r.length) {
                    a [i] = r [ri];
                    i ++;
                    ri ++;
                }
            }
            if (ri >= r.length) {
                while (li < l.length) {
                    a [i] = l [li];
                    li ++;
                    i ++;
                }
            }
        }
    }
}





static void merge(int[] a, int[] l, int[] r) {
    int n = l.length + r.length;
    int[] temp = new int[n];
    int i = 0, j = 0, k = 0;
    while (i < l.length && j < r.length) {
        if (l[i] <= r[j]) {
            temp[k++] = l[i++];
        } else {
            temp[k++] = r[j++];
        }
    }
    while (i < l.length) {
        temp[k++] = l[i++];
    }
    while (j < r.length) {
        temp[k++] = r[j++];
    }
    System.arraycopy(temp, 0, a, 0, n);
}


