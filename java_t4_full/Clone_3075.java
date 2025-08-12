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
    BitSet bitSet = new BitSet();
    long sum = ((long) X * (X + 1)) / 2;
    long sumCheck = 0;
    for (int i=0; i< A.length; i++) {
        if (!bitSet.get(A[i])) { 
            sumCheck += A[i];
            bitSet.set(A[i]);
            if (sumCheck == sum) return i;
        }
    }
    return -1;
}


