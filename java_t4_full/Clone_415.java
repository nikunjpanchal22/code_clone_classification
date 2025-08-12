public int solution (int X, int [] A) {
    Set < Integer > leaves = new HashSet < > ();
    for (int i = 0;
    i < A.length; i ++) {
        leaves.add (A [i]);
        if (leaves.contains (X) && leaves.size () == X) return i;
    }
    return - 1;
}



 public int solution (int X, int[] A) { 
    Set<Integer> leaves = new HashSet<>(); 
    for (int i = 0; i < A.length; i++) { 
        leaves.add(A[i]); 
        if (leaves.size() == X) {
            boolean found = true;
            for (int j = 1; j <= X; j++) {
                if (!leaves.contains(j)) {
                    found = false;
                    break;
                }
            }
            if (found) return i;
        }
    } 
    return -1; 
} 


