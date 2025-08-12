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


 public int solution (int X, int [] A) {
    int sum1 = 0, sum2 = 0;
    int n = X;
    boolean [] seen = new boolean [n + 1];
    for (int i = 0; i <= n; i++) {
        sum1 += i;
    }
    for (int i = 0; i < A.length; i++) {
        if (A[i] > n || seen[A[i]]) continue;
        sum2 += A[i];
        seen[A[i]] = true;
        if (sum1 == sum2)
            return i;
    }
    return -1;
}


