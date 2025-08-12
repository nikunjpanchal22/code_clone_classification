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





public int solution(int X, int [] A) {
    boolean[] leafPositions = new boolean[X+1];
    int covered = X;
    for (int time=0; time<A.length; time++) {
        if (!leafPositions[A[time]]) {
            leafPositions[A[time]] = true;
            covered--;
            if (covered == 0) return time;
        }
    }
    return -1;
}


