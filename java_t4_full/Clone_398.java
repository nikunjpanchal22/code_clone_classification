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
    int count = 0;
    int res = -1;
    boolean[] exist = new boolean[X + 1];
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X) {
            exist[A[i]] = true;
            count++;
            if (count == X) {
                res = i;
                break;
            }
        }
    }
    return res;
}


