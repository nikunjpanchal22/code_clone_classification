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
    int[] leaves = new int[X];
    int counter = 0;
    for (int i = 0;
        i < A.length; i ++) {
        if(A[i] > 0 && A[i] <= X){
            if(leaves[A[i]-1] == 0){
                leaves[A[i]-1]++;
                counter++;
            }
            if(counter == X) return i;
        }
    }
    return -1;
}


