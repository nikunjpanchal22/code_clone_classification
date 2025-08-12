public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}


 public int solution (int X, int [] A) {
 LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X) lhset.add(A[i]);
        if (lhset.size() == X) return i;
    }
    return -1;
}
