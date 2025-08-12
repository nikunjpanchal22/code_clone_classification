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
    int result = -1;
    boolean[] flag = new boolean[X + 1];
    int counter = 0;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && !flag[A[i]]) {
            flag[A[i]] = true;
            counter++;
            if (counter == X) {
                result = i;
                break;
            }
        }
    }
    return result;
}


