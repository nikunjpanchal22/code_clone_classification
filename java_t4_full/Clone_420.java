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
    int leavesGathered = 0;
    int leafCounter = new int[X];
    
    for (int i = 0; i < A.length; i++) {
        if (A[i] == X) {
            if(leafCounter[A[i] - 1] <= 0) leavesGathered++;
            leafCounter[A[i] - 1] = 1;
            if (leavesGathered == X) return i;
        }
    } 
    return -1;
}


