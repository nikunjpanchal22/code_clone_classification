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
   boolean[] hasLeaf = new boolean[X+1];
   
   for (int i = 0; i < A.length; i++) {
       if (!hasLeaf[A[i]]) {
           leavesGathered++;
           hasLeaf[A[i]] = true;
           if (leavesGathered == X) return i;
       }
   } 
   return -1;
}


