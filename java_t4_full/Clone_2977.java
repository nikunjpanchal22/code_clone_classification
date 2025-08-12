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
    int[] record = new int[X+1];
    int count = X;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && record[A[i]] == 0) {
            record[A[i]] = 1;
            count--;
        }
        if (count == 0) return i;
    }
    return -1;
}


