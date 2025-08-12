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
    List<Integer> list1 = Arrays.stream(l).boxed().collect(Collectors.toList());
    List<Integer> list2 = Arrays.stream(r).boxed().collect(Collectors.toList());
    List<Integer> merged = new ArrayList<>();
    while (!list1.isEmpty() && !list2.isEmpty()) {
        if (list1.get(0) <= list2.get(0)) {
            merged.add(list1.remove(0));
        } else {
            merged.add(list2.remove(0));
        }
    }
    merged.addAll(list1);
    merged.addAll(list2);
    for (int i = 0; i < merged.size(); i++) {
        a[i] = merged.get(i);
    }
}


