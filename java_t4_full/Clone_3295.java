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
    Set<Integer> leaves = new HashSet<>();
    Iterator<Integer> iter = leaves.iterator();
    while(iter.hasNext()) {
        int i = iter.next();
        leaves.add(A[i]);
        if (leaves.size() == X && leaves.contains(X)) 
            return i;
    }
    return -1;
}


