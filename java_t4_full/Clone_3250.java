public int solution (int X, int [] A) {
    Set < Integer > set = new HashSet < Integer > ();
    int sum1 = 0, sum2 = 0;
    for (int i = 0;
    i <= X; i ++) {
        sum1 += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (set.contains (A [i])) continue;
        set.add (A [i]);
        sum2 += A [i];
        if (sum1 == sum2) return i;
    }
    return - 1;
}





public int solution(int X, int[] A) {
    int total = X * (X + 1) / 2;
    boolean[] seen = new boolean[X + 1];
    for (int i = 0; i < A.length; i++) {
        if (!seen[A[i]]) {
            total -= A[i];
            seen[A[i]] = true;
            if (total == 0) return i;
        }
    }
    return -1;
}


