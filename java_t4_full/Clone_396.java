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
    int[] leaves = new int[X + 1];
    int cnt = 0;
    int res = -1;
    for (int i = 0; i < A.length; i++) {
        if (A[i] > X) continue;
        if (leaves[A[i]] == 0) {
            leaves[A[i]] = 1;
            cnt++;
            if (cnt == X) {
                res = i;
                break;
            }
        }
    }
    return res;
}


