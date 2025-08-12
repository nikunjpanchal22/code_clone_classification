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
Set<Integer> set = new TreeSet<Integer>();
    for (int i= 0; i < A.length; i++) {
        if(A[i] <= X) set.add(A[i]);
        if (set.size() == X) return i;
    }
    return -1;
}
