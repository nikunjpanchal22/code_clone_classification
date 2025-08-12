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
    Set<Integer> set = new HashSet<>();
    int sum1 = X * (X + 1) / 2;
    int sum2 = 0;
    return IntStream.range(0, A.length)
            .filter(i -> !set.contains(A[i]) && ((sum2 += A[i]) == sum1 || set.add(A[i]) == false))
            .findFirst().orElse(-1);
}


