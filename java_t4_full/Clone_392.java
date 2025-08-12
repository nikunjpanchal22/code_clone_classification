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
    int[] occupiedPositions = new int[X];
    for (int i = 0; i < A.length; i++) {
        occupiedPositions[A[i] - 1] = 1;
        int j;
        for (j = 0; j < X; j++) {
            if (occupiedPositions[j] == 0) {
                break;
            }
        }
        if (j == X) {
            return i;
        }
    }
    return -1;
}


