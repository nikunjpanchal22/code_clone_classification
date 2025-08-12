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
    BitSet leaves = new BitSet(X + 1);
 
    for (int i = 0; i < A.length; i++) {
        leaves.set(A[i]);
        if (leaves.cardinality() == X) return i;
    }
    return -1;
}


