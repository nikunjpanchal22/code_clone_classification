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
    Set < Integer > leaves = new HashSet <> ();
    int res = -1;
    for (int i = 0; i < A.length; i++) {
        if (!leaves.contains(A[i])) {
            leaves.add(A[i]);
            if (leaves.size() == X) {
                res = i;
                break;
            }
        }
    }
    return res;
}


