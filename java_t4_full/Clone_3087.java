public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}




public int solution (int X, int[] A) {
    Set<Integer> hSet = new HashSet<>();
    int i = 0;
    while(i < A.length){
        if (A[i] <= X) {
            hSet.add(A[i]);
        }
        if(hSet.size() == X){
            return i;
        }
        i++;
    }
    return -1;
}


