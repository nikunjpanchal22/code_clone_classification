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
    int[] leaves = new int[X+1];
    int filledPositions = 0;
    for (int i = 0; i<A.length; i++) {
        if (leaves[A[i]] == 0) {
            leaves[A[i]] = 1;
            filledPositions++;
        }
        if (filledPositions == X) {
            return i;
        }
    }
    return -1;
}


