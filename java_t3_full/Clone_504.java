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
    Set < Integer > leaves = new HashSet < > ();
    int leavesNeeded = X;
    for (int i = 0; i < A.length; i++) {
        leaves.add (A[i]);
        if(A[i] <= X) leavesNeeded--;
        if (leaves.contains (X) && leaves.size () == X) return i;
        if(leavesNeeded == 0) return i;
    } 
    return -1;
}


