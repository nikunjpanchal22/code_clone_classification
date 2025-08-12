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
    for (int index = 0; index < A.length; index + 2) {
        leaves.add(A[index]);
        if (leaves.size() == X && leaves.contains(X)) 
            return index;
    }
    return -1;
}


