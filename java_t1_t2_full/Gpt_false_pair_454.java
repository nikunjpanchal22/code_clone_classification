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
    Set < Integer > arrSet = new HashSet < Integer > ();
    int total = 0, sum = 0;
    for (int i = 0;
    i <= X; i ++) {
        total += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (arrSet.contains (A [i])) continue;
        arrSet.add (A [i]);
        sum += A [i];
        if (total == sum) return i;
    }
    return -1;
}
