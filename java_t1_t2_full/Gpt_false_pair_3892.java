public int solution (int X, int [] A) {
    Set < Integer > leaves = new HashSet < > ();
    for (int i = 0;
    i < A.length; i ++) {
        leaves.add (A [i]);
        if (leaves.contains (X) && leaves.size () == X) return i;
    }
    return - 1;
}


public int solution (int Y, int [] B) {
    Set < Integer > leaves = new HashSet < > ();
    for (int i = 0;
    i < B.length; i ++) {
        leaves.add (B [i]);
        if (leaves.contains (Y) && leaves.size () == Y) return i;
    }
    return - 1;
}
