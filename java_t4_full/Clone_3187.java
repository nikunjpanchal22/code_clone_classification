public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}




public int solution(int X, int [] A) {
    BitSet bs = new BitSet(X);
    int counter = X;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && !bs.get(A[i] - 1)) {
            bs.set(A[i] - 1);
            counter--;
            if (counter == 0) return i;
        }
    }
    return -1;
}


