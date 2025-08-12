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
    int sum = 0;
    int[] leafFallenAt = new int[X + 1];
    for (int i = 0; i < A.length; i++) {
        if (leafFallenAt[A[i]] == 0) {
            leafFallenAt[A[i]] = 1;
            sum += 1;
            if (sum == X) return i;
        }
    }
    return -1;
}


