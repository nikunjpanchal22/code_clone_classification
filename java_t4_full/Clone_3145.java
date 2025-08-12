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
    HashSet<Integer> leaves = new HashSet<>();
    int size = 0;
    while (size < A.length) {
        if(leaves.add(A[size]) && leaves.size()==X)
        return size;
        size++;
    }
    return -1;
}


