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
    mergeSub(a, 0, l, 0, r, 0);
        }

        static void mergeSub(int[] a, int aIndex, int[] l, int lIndex, int[] r, int rIndex) {
            if(lIndex == l.length && rIndex == r.length) return;
            if(lIndex < l.length && (rIndex == r.length || l[lIndex] < r[rIndex])) {
                a[aIndex] = l[lIndex];
                mergeSub(a, aIndex + 1, l, lIndex + 1, r, rIndex);
            } else {
                a[aIndex] = r[rIndex];
                mergeSub(a, aIndex + 1, l, lIndex, r, rIndex + 1);
            }
}


