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
    boolean[] leaves = new boolean[X];
    int leavesNeeded = X;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && !leaves[A[i] - 1]) {
            leaves[A[i] - 1] = true;
            leavesNeeded--;
        }
        if (leavesNeeded == 0) return i;
    } 
    return -1;
}


