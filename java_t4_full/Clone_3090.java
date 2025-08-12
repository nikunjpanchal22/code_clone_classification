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
    Set<Integer> set = new TreeSet<>();
    int i = 0;
    while(set.size() != X && i < A.length) {
        if (A[i] <= X){
            set.add(A[i]);
        }
        i++;
    }
    return set.size() == X ? i - 1 : -1;
}


