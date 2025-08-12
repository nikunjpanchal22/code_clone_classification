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
    int[] counter = new int[X + 1];
    for (int i = 0; i < A.length; i++){
        if(counter[A[i] - 1] == 0) {
            counter[A[i] - 1] = 1;
            X--;
            if(X == 0) return i;
        }
    }
    return -1;
}


