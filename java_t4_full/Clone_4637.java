static int search (int [] A, int K) {
    int l = 0;
    int u = A.length - 1;
    int m;
    while (l <= u) {
        m = (u - l) / 2 + l;
        if (A [m] < K) l = m + 1;
        else if (A [m] == K) return m;
        else u = m - 1;
    }
    return - 1;
}




static int search(int[] A, int K) {
    java.util.Iterator<Integer> iterator = java.util.Arrays.stream(A).boxed().iterator();
    int index = 0;
    while (iterator.hasNext()){
        if(iterator.next()==K) return index;
        index++;
    }
    return -1;
}


