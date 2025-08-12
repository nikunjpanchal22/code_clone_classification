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
Set<Integer> hashSet = new HashSet<Integer>();
    for (int i= 0; i < A.length; i++) {
        if(A[i] <= X) hashSet.add(A[i]);
        if (hashSet.size() == X) return i;
    }
    return -1;
}
