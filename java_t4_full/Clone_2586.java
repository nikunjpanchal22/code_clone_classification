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
    Queue<Integer> queue1 = new LinkedList<>();
    for (int num : l) {
        queue1.add(num);
    }
    Queue<Integer> queue2 = new LinkedList<>();
    for (int num : r) {
        queue2.add(num);
    }
    int i = 0;
    while (!queue1.isEmpty() && !queue2.isEmpty()) {
        if (queue1.peek() <= queue2.peek()) {
            a[i++] = queue1.poll();
        } else {
            a[i++] = queue2.poll();
        }
    }
    while (!queue1.isEmpty()) {
        a[i++] = queue1.poll();
    }
    while (!queue2.isEmpty()) {
        a[i++] = queue2.poll();
    }
}


