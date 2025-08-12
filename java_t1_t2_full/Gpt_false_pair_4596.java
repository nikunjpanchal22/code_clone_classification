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


public int solution(final int X, final int[] B) {
    Set<Integer> emptyPositions = new HashSet<Integer>();
    for (int j = 1; j <= X; j++) {
        emptyPositions.add(j);
    }
    for (int j = 0; j < B.length; j++) {
        emptyPositions.remove(B[j]);
        if (emptyPositions.size() == 0) {
            return j;
        }
    }
    return -1;
}
