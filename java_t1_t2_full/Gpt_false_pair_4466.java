public E [] next () {
    if (! has_next) throw new NoSuchElementException ();
    for (int i = 0;
    i < ind.length; i ++) {
        output [i] = arr [ind [i]];
    }
    has_next = false;
    for (int tail = ind.length - 1;
    tail > 0; tail --) {
        if (ind [tail - 1] < ind [tail]) {
            int s = ind.length - 1;
            while (ind [tail - 1] >= ind [s]) s --;
            swap (ind, tail - 1, s);
            for (int i = tail, j = ind.length - 1;
            i < j; i ++, j --) {
                swap (ind, i, j);
            }
            has_next = true;
            break;
        }
    }
    return output;
}


public E [] next () {
    if (! has_next) throw new NoSuchElementException ();
    for (int i = 0;
    i < ind.length; i ++) {
        output [i] = arr [ind [i]];
    }
    has_next = false;
    for (int tail = ind.length - 1;
    tail > 0; tail --) {
        if (ind [tail - 1] > ind [tail]) {
            int s = ind.length - 1;
            while (ind [tail - 1] >= ind [s]) s --;
            swap (ind, tail - 1, s);
            for (int i = tail, j = ind.length - 1;
            i < j; i ++, j --) {
                swap (ind, i, j);
            }
            has_next = true;
            break;
        }
    }
    return output;
}
