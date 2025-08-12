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
    long s = X * (X + 1L) >> 1;
    long t = 0;
    boolean[] found = new boolean[X + 1];
    int count = 0;
    for (int i = 0; i < A.length; ++i) {
        if (!found[A[i]]) {
            ++count;
            t += A[i];
            found[A[i]] = true;
        }
        if (t == s && count == X)
            return i;
    }
    return -1;
}


