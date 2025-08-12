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
    Set<Integer> leaves = new CopyOnWriteArraySet<>();
    int index;
    for (index = 0; index < A.length; index++) {
        leaves.add(A[index]);
        if (leaves.contains(X) && leaves.size() == X) return index;
    }
    return -1;
}


