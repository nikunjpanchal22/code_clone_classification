public int solution (int X, int [] A) {
    Set < Integer > leaves = new HashSet < > ();
    for (int i = 0;
    i < A.length; i ++) {
        leaves.add (A [i]);
        if (leaves.contains (X) && leaves.size () == X) return i;
    }
    return - 1;
}



 public int solution (int X, int [] A) {
    int result = -1;
    BitSet bitset = new BitSet(X);
    for (int i = 0; i < A.length; i++) {
        if (A[i] > X) continue;
        if (!bitset.get(A[i])) {
            bitset.set(A[i]);
            if (bitset.cardinality() == X) {
                result = i;
                break;
            }
        }
    }
    return result;
}


