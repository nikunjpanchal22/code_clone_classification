public int solution (int X, int [] A) {
    Set < Integer > leaves = new HashSet < > ();
    for (int i = 0;
    i < A.length; i ++) {
        leaves.add (A [i]);
        if (leaves.contains (X) && leaves.size () == X) return i;
    }
    return - 1;
}





public int solution(int X, int[] A) {
    boolean[] fallenLeaves = new boolean[X + 1];
    int leavesValue = 0;

    for (int i = 0; i < A.length; i++) {
        if (!fallenLeaves[A[i]]) {
            fallenLeaves[A[i]] = true;
            leavesValue += A[i];
            if (leavesValue == X * (X + 1) / 2)
                return i;
        }
    }

    return -1;
}


