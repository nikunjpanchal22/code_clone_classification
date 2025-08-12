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
    Set<Integer> set = new HashSet<>();
    int total = (X * (X + 1)) / 2;
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && !set.contains(A[i])) sum += A[i];
        if (sum == total) return i;
    }
    return -1;
}


