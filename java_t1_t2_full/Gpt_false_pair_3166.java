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


public int solution (int Y, int [] A) {
    Set < Integer > set = new HashSet < Integer > ();
    int sum3 = 0, sum4 = 0;
    for (int i = 0;
    i <= Y; i ++) {
        sum3 += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (set.contains (A [i])) continue;
        set.add (A [i]);
        sum4 += A [i];
        if (sum3 == sum4) return i;
    }
    return - 1;
}
