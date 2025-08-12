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
    int totalLeaves = 0;
    boolean[] leaves = new boolean[X];
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X) {
            if (!leaves[A[i] - 1]) {
                totalLeaves++;
                leaves[A[i] - 1] = true;
            }
            if (totalLeaves == X) return i;
        }
    } 
    return -1;
}


