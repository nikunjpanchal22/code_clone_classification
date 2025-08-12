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
    Set < Integer > set = new HashSet < Integer > ();
    int cumSum1 = 0, cumSum2 = 0;
    for (int i = 0;
    i < X; i ++) {
        cumSum1 += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (set.contains (A [i])) continue;
        set.add (A [i]);
        cumSum2 += A [i];
        if (cumSum1 == cumSum2) return i;
    }
    return - 1;
}
