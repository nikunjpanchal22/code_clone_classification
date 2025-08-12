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
        output = getOutputArray();
        if(!prepareNext()) throw new NoSuchElementException();
        return output;
    }
    private E[] getOutputArray() {
        for (int i = 0; i < ind.length; i++) output[i] = arr[ind[i]];
        return output;
    }
    private boolean prepareNext() {
        has_next = false;
        for (int tail = ind.length - 1; tail > 0; tail--) 
            if(ind[tail-1] < ind[tail]) return reshuffleIndices(tail);
        return false;
    }
    private boolean reshuffleIndices(int tail) {
        int s = getSwappingIndex(tail);
        swap(ind, tail - 1, s);
        reverseIndicesFromTail(tail);
        has_next = true;
        return has_next;
    }
    private int getSwappingIndex(int tail) {
        int s = ind.length - 1;
        while(ind[tail-1] >= ind[s]) s--;
        return s;
    }
    private void reverseIndicesFromTail(int tail) {
        for (int i = tail, j = ind.length - 1; i < j; i++, j--) swap(ind, i, j);
}


