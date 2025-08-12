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
    Integer[] index = new Integer[X+1];
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && index[A[i]] == null) {
            index[A[i]] = i;
            if (Arrays.stream(index, 1, X+1).noneMatch(Objects::isNull)) return i;
        }
    }
    return -1;
}


