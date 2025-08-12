public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}




public int solution(int X, int [] A) {
    int[] leaves = new int[X];
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && leaves[A[i] - 1] == 0) {
            leaves[A[i] - 1] = 1;
            sum++;
            if (sum == X) return i;
        }
    }
    return -1;
}


