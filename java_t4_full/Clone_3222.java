public int solution (final int X, final int [] A) {
    Set < Integer > emptyPosition = new HashSet < Integer > ();
    for (int i = 1;
    i <= X; i ++) {
        emptyPosition.add (i);
    }
    for (int i = 0;
    i < A.length; i ++) {
        emptyPosition.remove (A [i]);
        if (emptyPosition.size () == 0) {
            return i;
        }
    }
    return - 1;
}



  

public int solution(int X, int[] A) {
    int sum = 0;
    int targetSum = IntStream.range(1, X + 1).sum();
    Set<Integer> unique = new HashSet<>();
    for(int i = 0; i < A.length; i++) {
        unique.add(A[i]);
        sum += A[i];
        if (sum == targetSum && unique.size() == X) return i;
    }
    return -1;
}


