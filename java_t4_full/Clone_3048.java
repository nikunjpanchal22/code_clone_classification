public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}





public int solution(int X, int[] A) {
    boolean[] checked = new boolean[X];
    int left = X;
    for (int i = 0; i < A.length; i++) {
        if (!checked[A[i]-1]) {
            checked[A[i]-1] = true;
            left--;
        }
        if (left == 0) return i;
    }
    return -1;
}


