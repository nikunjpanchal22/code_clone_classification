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
    int leaves = 0;
    
    for (int i = 0; i < A.length; i ++) {
        if (!helperFunction(A[i], A)) continue;
         
         leaves++;
         if (leaves == X) return i;
    } 
    return -1;
}


