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
    int uniqueLeaves = 0;
    int res = -1;
    for (int i = 0; i < A.length; i++) {
        if ((uniqueLeaves & (1 << A[i])) != 0) continue;
        uniqueLeaves += (1 << A[i]);
        if (uniqueLeaves == (1 << X) - 1) return i;
    }
    return res;
}


