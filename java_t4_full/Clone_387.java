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


  public int solution (final int X, final int [] A) {
    boolean[] fullPositions = new boolean[X+1];
    for (int i = 0; i < A.length; i++) {
        fullPositions[A[i]] = true;
        int j;
        for (j = 0; j <= X; j++) {
            if (!fullPositions[j]) {
                break;
            }
        }
        if (j > X) {
            return i;
        }
    }
    return -1;
}


