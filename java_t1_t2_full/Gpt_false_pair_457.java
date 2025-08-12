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
    Set < Integer > singular = new HashSet < Integer > ();
    int accum = 0, join = 0;
    for (int i = 0;
    i <= X; i ++) {
        accum += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (singular.contains (A [i])) continue;
        singular.add (A [i]);
        join += A [i];
        if (accum == join) return i;
    }
    return -1;
}
