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
    Set < Integer > unrepeatable = new HashSet < Integer > ();
    int leftside = 0, rightside = 0;
    for (int i = 0;
    i <= X; i ++) {
        leftside += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (unrepeatable.contains (A [i])) continue;
        unrepeatable.add (A [i]);
        rightside += A [i];
        if (leftside == rightside) return i;
    }
    return -1;
}
