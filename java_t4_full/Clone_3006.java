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





public int solution(int X, int[] A ) {
    Set<Integer> stepsSet = new HashSet<>(X);
    int destination = (1 + X) * X / 2;

    for (int time = 0; time < A.length; time++) {
        stepsSet.add(A[time]);
        destination -= A[time];
        if (destination == 0 && stepsSet.size() == X) 
            return time;
    }
    return -1;
}


